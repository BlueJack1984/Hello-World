package com.example.demo.config;

import com.example.demo.entity.User;
import com.example.demo.service.ConditionListener;
import com.example.demo.service.impl.LinuxCommand;
import com.example.demo.service.impl.LinuxService;
import com.example.demo.service.impl.WindowsCommand;
import com.example.demo.service.impl.WindowsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsService.class)
    public ConditionListener windowsCondition() {
        System.out.println("有一个windows用户创建啦~~~~~~~~~~~");
        return new WindowsCommand();
    }

    @Bean
    @Conditional(LinuxService.class)
    public ConditionListener linuxCondition() {
        System.out.println("有一个linux用户创建啦~~~~~~~~~~~");
        return new LinuxCommand();
    }

    @Bean
    public User createUser() {
        //System.out.println("有一个用户创建啦~~~~~~~~~~~");
        return new User();
    }
}
