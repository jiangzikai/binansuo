package com.kaihang.binansuo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个测试控制器接口
 */
@RestController

@Api(value = "FirstTestController", tags = {"第一个测试控制器接口"})
public class FirstTestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    @ApiOperation(value = "这个方法是sayHi")
    public String sayHi(){
        System.out.println("hi,this is first controller test,the port is "+port);
        return "hi,this is first controller test,the port is "+port;
    }
}
