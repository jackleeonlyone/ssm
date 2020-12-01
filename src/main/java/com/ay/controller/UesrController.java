package com.ay.controller;

import com.ay.entity.User;
import com.ay.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UesrController {
    @Resource
    private UserService userservice;


    @RequestMapping(value = "/selectuserbyid",method = RequestMethod.GET)
    public String selectUserByid(@RequestParam(value = "id") Integer id){
        if (null !=id) {
            User obj= userservice.selectByPrimaryKey(id);
            System.out.println(obj.toString());
        }
        return "test";
    }
}
