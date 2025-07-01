package com.nageoffer.shortlink.project.dto.req;

import lombok.Data;

/**
 * 回收站保存功能
 */
@Data
public class RecycleBinSaveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部连接
     */
    private String fullShortUrl;
}
