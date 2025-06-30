package com.nageoffer.shortlink.project.common.constant;

/**
 * redis key常量类
 */
public class RedisKeyConstant {
    /**
     * 短链接跳转前缀key
     */
    public static final String GOTO_SHORT_LINK_KEY = "short-link:goto:%s";

    /**
     * 短链接跳转锁前缀 Key
     */
    public static final String LOCK_GOTO_SHORT_LINK_KEY = "short-link:lock:goto:%s";
}
