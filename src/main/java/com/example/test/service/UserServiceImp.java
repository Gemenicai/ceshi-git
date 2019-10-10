package com.example.test.service;

import com.example.test.mapper.SpmtestMapper;
import com.example.test.pojo.Spmtest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:liuqun
 * @Date:2019/9/27
 * @Description:com.example.test.service
 * @Version:1.0
 */
@Service
public class UserServiceImp implements UserService{
    @Resource
    private SpmtestMapper spmtestMapper;

    @Override
    public Spmtest queryById(Integer id) {
        return spmtestMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Spmtest> query() {
        return spmtestMapper.queryAll();
    }
}
