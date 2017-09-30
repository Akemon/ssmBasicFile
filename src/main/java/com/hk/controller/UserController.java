package com.hk.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hk.bean.Message;
import com.hk.bean.User;
import com.hk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getAllUsers")
    public String getAllUsers(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model){
        PageHelper.startPage(pageNum,5);
        //之后的查询即为分页查询
        List<User> userList= userService.getAllUsers();
        //使用pageInfo包装结果
        PageInfo pageInfo =new PageInfo(userList,5);
        Message message = Message.success().add("pageInfo",pageInfo);
        model.addAttribute("message",message);
        return "index";
    }


    @RequestMapping("/test")
    @ResponseBody
    public Message test123(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum,5);
        //之后的查询即为分页查询
        List<User> userList= userService.getAllUsers();
        //使用pageInfo包装结果
        PageInfo pageInfo =new PageInfo(userList,5);
        return Message.success().add("pageInfo",pageInfo);
    }


}
