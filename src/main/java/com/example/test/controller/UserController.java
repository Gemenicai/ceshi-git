package com.example.test.controller;

import com.example.test.pojo.Spmtest;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:liuqun
 * @Date:2019/9/27
 * @Description:com.example.test.controller
 * @Version:1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public Spmtest queryUserId(@PathVariable("id")Integer id){
        return this.userService.queryById(id);
    }

    @RequestMapping("/testQA")
    public String toUsers(Model model){
        List<Spmtest> users=this.userService.query();
        System.out.println(users);
        model.addAttribute("users",users);
        return "spmtest";
    }

}
