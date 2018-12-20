package com.service.called.controller;

import com.service.called.client.CallServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 98050
 * @Time: 2018-12-20 15:17
 * @Feature:
 */
@RestController
@RequestMapping("call-service")
public class CallController {

    @Autowired
    private CallServiceClient callServiceClient;

    @GetMapping("call")
    public String test(){
        return this.callServiceClient.call();
    }
}
