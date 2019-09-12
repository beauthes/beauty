package com.sakura.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Qilin
 * @date 2019/09/09
 */
@FeignClient(name = "user-dao",fallback = UserFeignHystrix.class)
public interface UserFeignClient {
    @RequestMapping(value = "/test123",method = RequestMethod.GET)
    String test();
}
