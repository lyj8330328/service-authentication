package com.service.called.becalled.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 98050
 * @Time: 2018-12-20 15:12
 * @Feature:
 */
@RestController
@RequestMapping("be-called-service")
public class BeCalledController {

    @GetMapping("call")
    public String call(){
        return "hello";
    }

    @GetMapping(value = "test",produces = "application/json;charset=utf-8")
    public String test(){
        return "测试";
    }
}
