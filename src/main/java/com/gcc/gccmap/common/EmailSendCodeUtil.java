package com.gcc.gccmap.common;

import com.gcc.gccmap.config.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
public class EmailSendCodeUtil {
    @Autowired(required = false)
    private JavaMailSender sender;

    @Resource
    RedisCache redisCache;

    //获取yaml配置文件中的信息
    @Value("${spring.mail.username}")
    private String from;

    // 截取当前时间戳的后四位模拟验证码
    public String getVerificationCode(){
        long timestamp = System.currentTimeMillis();
        return Long.toString(timestamp).substring(Long.toString(timestamp).length() - 4);
    }
    //to 接收邮箱账号  subject 邮件主题
    public boolean sendEmail(String to, String subject) {
        String code = getVerificationCode();
        String contents = "验证码："+ code + "，切勿将验证码泄露给他人，本条验证码有效期5分钟。"; // 发送邮件的内容
        // 创建一个简单消息对象，用于发送简单消息（不带附件或连接等）
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        // 封装邮件信息
        simpleMailMessage.setFrom(from); // 设置发送方
        simpleMailMessage.setTo(to); // 设置接收方
        simpleMailMessage.setSubject(subject); // 设置主题
        simpleMailMessage.setText(contents); // 设置发送内容
        // 发送动作
        sender.send(simpleMailMessage);

        //以邮箱账号为key,验证码为值传入redis,期限为5分钟
        redisCache.setCacheObject(to,code,5, TimeUnit.MINUTES);
        return true;
    }





}
