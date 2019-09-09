package com.sakura.user.feign;

import org.springframework.stereotype.Component;

/**
 * @author Qilin
 * @date 2019/09/09
 */
@Component
public class UserFeignHystrix implements  UserFeignClient {
    @Override
    public String test() {
        return "error";
    }
}
