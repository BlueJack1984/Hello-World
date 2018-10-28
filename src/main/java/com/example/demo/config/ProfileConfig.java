package com.example.demo.config;

import com.example.demo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public Student devStudent() {
        return new Student("curry", 30);
    }

    @Bean
    @Profile("prod")
    public Student prodStudent() {
        return new Student("durant", 35);
    }
}
