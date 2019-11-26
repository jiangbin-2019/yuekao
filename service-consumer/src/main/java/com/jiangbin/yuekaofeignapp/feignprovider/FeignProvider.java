package com.jiangbin.yuekaofeignapp.feignprovider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("/provider-service")
public interface FeignProvider {
    @RequestMapping("/provider/list")
    List<String> selectByTransportAll();
}
