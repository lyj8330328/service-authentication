package com.service.called.becalled.api;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 98050
 * @Time: 2018-12-20 15:13
 * @Feature:
 */
@RequestMapping("be-called-service")
public interface BeCalledApi {

    /**
     * 被调服务接口
     * @return
     */
    @RequestMapping("call")
    String call();
}
