package com.sakura.user.service;

import com.sakura.user.feign.UserFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Qilin
 * @date 2019/09/09
 */
@Component
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserFeignClient userFeignClient;
    @Override
    public String test() {
        return this.userFeignClient.test();
    }
}
