package com.gcc.gccmap.util;

import com.gcc.gccmap.config.RedisCache;
import com.gcc.gccmap.exception.IllegalTokenException;
import com.gcc.gccmap.exception.UserNotExistException;
import com.gcc.gccmap.model.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.util.StringUtils;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * JWT工具类
 */
public class JwtUtil {

    //有效期为
    public static final Long JWT_TTL = 60 * 60 * 1000L;// 60 * 60 *1000  一个小时

    public static final Long JWT_TTL_DAY = JWT_TTL * 24 * 5;
    //设置秘钥明文
    public static final String JWT_KEY = "gaojianjie";

    public static String getUUID() {
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        return token;
    }

    /**
     * 生成jtw
     *
     * @param subject token中要存放的数据（json格式）
     * @return
     */
    public static String createJWT(String subject) {
        JwtBuilder builder = getJwtBuilder(subject, null, getUUID());
        return builder.compact();
    }

    /**
     * 生成jtw
     *
     * @param subject   token中要存放的数据（json格式）
     * @param ttlMillis token超时时间
     * @return
     */
    public static String createJWT(String subject, Long ttlMillis) {
        JwtBuilder builder = getJwtBuilder(subject, ttlMillis, getUUID());// 设置过期时间
        return builder.compact();
    }

    private static JwtBuilder getJwtBuilder(String subject, Long ttlMillis, String uuid) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        SecretKey secretKey = generalKey();
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        if (ttlMillis == null) {
            ttlMillis = JwtUtil.JWT_TTL;
        }
        long expMillis = nowMillis + ttlMillis;
        Date expDate = new Date(expMillis);
        return Jwts.builder()
                .setId(uuid)              //唯一的ID
                .setSubject(subject)   // 主题  可以是JSON数据
                .setIssuer("gjj")     // 签发者
                .setIssuedAt(now)      // 签发时间
                .signWith(signatureAlgorithm, secretKey) //使用HS256对称加密算法签名, 第二个参数为秘钥
                .setExpiration(expDate);
    }

    /**
     * 创建token
     *
     * @param id
     * @param subject
     * @param ttlMillis
     * @return
     */
    public static String createJWT(String id, String subject, Long ttlMillis) {
        JwtBuilder builder = getJwtBuilder(subject, ttlMillis, id);// 设置过期时间
        return builder.compact();
    }

    public static void main(String[] args) throws Exception {
//        String token = "BDIL5ou8fWsbt_ebgeyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJmNWY5MmJmYzc2ODI0NGM4ODgyMTYzOTE5NjE1NjNjMyIsInN1YiI6Imdhb2ppYW5qaWUiLCJpc3MiOiJnamoiLCJpYXQiOjE2Nzg1MDUxMTYsImV4cCI6MTY3ODUwODcxNn0.Epf29svBLuUnbr4FfcZS_dyqAOfbF1eGkkHMo4-sGtMFpa";
//        Claims claims = parseJWT(token);
//        System.out.println(claims);
        String jwt = createJWT("gaojianjie");
        System.out.println(jwt);

    }

    /**
     * 生成加密后的秘钥 secretKey
     *
     * @return
     */
    public static SecretKey generalKey() {
        byte[] encodedKey = Base64.getDecoder().decode(JwtUtil.JWT_KEY);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    /**
     * 解析
     *
     * @param jwt
     * @return
     * @throws Exception
     */
    public static Claims parseJWT(String jwt) throws Exception {
        SecretKey secretKey = generalKey();
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(jwt)
                .getBody();
    }

    //每次请求刷新token
    public static String flushToken(RedisCache redisCache) {
        //logout   如果redis中的user数据被删除了，就不用刷新token给前端了

        //当前请求的token
        String token = ThreadLocalUtil.getCurrentUserToken();
        //如果token为空则抛出异常
        if (!StringUtils.hasText(token)) {
            throw new IllegalTokenException("token被破坏");
        }
        //解析token为userId
        String userId = null;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = claims.getSubject();
        } catch (Exception e) {
            throw new IllegalTokenException("token被破坏");
        }
        User user = redisCache.getCacheObject("login:" + userId);
        if (!Objects.isNull(user)) {
            //刷新token返回给前端
            return JwtUtil.createJWT(userId, JwtUtil.JWT_TTL_DAY);
        }
        throw new UserNotExistException("登录超时,请重新登陆");
    }

    public static String getCurrentUserId() {
        String token = ThreadLocalUtil.getCurrentUserToken();
        //解析token
        Claims claims = null;
        try {
            claims = JwtUtil.parseJWT(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获取userId
        return claims.getSubject();
    }

    public static void returnJson(HttpServletResponse response, String result) throws Exception {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        try {
            writer = response.getWriter();
            writer.print(result);

        } catch (IOException e) {
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}