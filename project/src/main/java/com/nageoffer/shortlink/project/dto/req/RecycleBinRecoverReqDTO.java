package com.nageoffer.shortlink.project.dto.req;

import lombok.Data;

/**
 * 回收站恢复功能
 */
@Data
public class RecycleBinRecoverReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部连接
     */
    private String fullShortUrl;
}
