package com.example.test.service;

import com.example.test.pojo.Spmtest;

import java.util.List;

/**
 * @Author:liuqun
 * @Date:2019/9/27
 * @Description:com.example.test.service
 * @Version:1.0
 */

public interface UserService {
    Spmtest queryById(Integer id);
    List<Spmtest> query();
}
