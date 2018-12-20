package com.service.called.client;

import com.service.called.becalled.api.BeCalledApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: 98050
 * @Time: 2018-12-20 15:15
 * @Feature:
 */
@FeignClient(value = "be-called-service")
public interface CallServiceClient extends BeCalledApi {

}
