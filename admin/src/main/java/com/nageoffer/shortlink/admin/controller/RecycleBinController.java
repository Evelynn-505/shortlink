package com.nageoffer.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.nageoffer.shortlink.admin.common.convention.result.Result;
import com.nageoffer.shortlink.admin.common.convention.result.Results;
import com.nageoffer.shortlink.admin.remote.ShortLinkRemoteService;
import com.nageoffer.shortlink.admin.remote.dto.req.RecycleBinRecoverReqDTO;
import com.nageoffer.shortlink.admin.remote.dto.req.RecycleBinRemoveReqDTO;
import com.nageoffer.shortlink.admin.remote.dto.req.RecycleBinSaveReqDTO;
import com.nageoffer.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.nageoffer.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import com.nageoffer.shortlink.admin.service.RecycleBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回收站管理控制层
 */
@RestController
@RequiredArgsConstructor
public class RecycleBinController {
    private final RecycleBinService recycleBinService;
    /**
     * 后续重构为springcloud feign调用
     */
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService(){};

    /**
     * 保存回收站
     */
    @PostMapping("/api/short-link/admin/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        shortLinkRemoteService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询回收站短链接
     */
    @GetMapping("/api/short-link/admin/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        return recycleBinService.pageRecycleBinShortLink(requestParam);
    }

    /**
     * 恢复短链接
     */
    @PostMapping("/api/short-link/admin/v1/recycle-bin/recover")
    public Result<Void> recoverRecycleBin(@RequestBody RecycleBinRecoverReqDTO requestParam) {
        shortLinkRemoteService.recoverRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 回收站移除功能
     * @param requestParam
     * @return
     */
    @PostMapping("/api/short-link/v1/recycle-bin/remove")
    public Result<Void> removeRecycleBin(@RequestBody RecycleBinRemoveReqDTO requestParam) {
        shortLinkRemoteService.removeRecycleBin(requestParam);
        return Results.success();
    }
}
