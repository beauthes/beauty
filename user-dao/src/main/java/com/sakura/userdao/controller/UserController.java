package com.sakura.userdao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qilin
 * @date 2019/09/09
 */
@RestController
@RefreshScope
public class UserController {
    @Value("${foo}")
    String foo;

    @GetMapping("/test123")
    public String save(){
        return foo;
    };
}
