package com.jiangbin.yuekaofeignapp.controller;

import com.jiangbin.yuekaofeignapp.feignprovider.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer-service")
@CrossOrigin
public class FeignController {

    @Autowired
    private FeignProvider feignProvider;
    //调用接口
    @RequestMapping("/list")
    public List<String> findAll(){
        return feignProvider.selectByTransportAll();
    }
}
