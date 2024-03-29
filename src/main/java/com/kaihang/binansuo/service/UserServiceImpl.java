package com.kaihang.binansuo.service;

import com.kaihang.binansuo.dao.entity.TbUser;
import com.kaihang.binansuo.dao.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public int saveUser(TbUser tbUser) {
        int insert = tbUserMapper.insert(tbUser);
        return insert;
    }
}
