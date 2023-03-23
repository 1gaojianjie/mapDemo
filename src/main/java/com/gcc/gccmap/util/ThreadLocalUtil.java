package com.gcc.gccmap.util;

public class ThreadLocalUtil {

        /**
         * 保存用户对象的ThreadLocal
         */
        private static final ThreadLocal<String> userThreadLocal = new ThreadLocal<>();

        /**
         * 添加当前用户token
         * @param
         */
        public static void addCurrentUserToken(String token){
            userThreadLocal.set(token);
        }

        /**
         * 获取当前登录用户token
         */
        public static String getCurrentUserToken(){
            return userThreadLocal.get();
        }


        /**
         * 删除当前登录token 移除当前用户
         */
        public static void remove(){
            userThreadLocal.remove();
        }
    }