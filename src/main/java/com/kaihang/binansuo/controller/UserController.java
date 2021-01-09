package com.kaihang.binansuo.controller;

import com.kaihang.binansuo.dao.entity.TbUser;
import com.kaihang.binansuo.dto.TbUserDTO;
import com.kaihang.binansuo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 用户控制器
 */
@RestController
@Api(value = "UserController", tags = {"用户控制器"})
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 保存用户信息
     */
    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    @ApiOperation(value = "这个方法是保存用户信息")
    public void saveUser(@RequestBody TbUserDTO tbUserDTO){
        TbUser tbuser = new TbUser();
        BeanUtils.copyProperties(tbUserDTO,tbuser);
        tbuser.setValidInd(1);
        tbuser.setCreateTime(new Date());
        userService.saveUser(tbuser);
        System.out.println("用户信息保存:"+tbuser.getName());
    }

}
