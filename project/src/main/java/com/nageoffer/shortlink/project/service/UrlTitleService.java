package com.nageoffer.shortlink.project.service;

import java.io.IOException;

/**
 * url标题接口层
 */
public interface UrlTitleService {
    /**
     * 根据url获取网站标题
     * @param url
     * @return
     */
    String getTitleByUrl(String url) throws IOException;
}
