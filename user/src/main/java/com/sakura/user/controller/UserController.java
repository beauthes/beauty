package com.sakura.user.controller;

import com.sakura.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qilin
 * @date 2019/09/09
 */
@AllArgsConstructor
@RestController
public class UserController {
    private  UserService userService;


    @GetMapping("/test")
    public String save(){

            return userService.test();

    }
}
