package com.example.demo.service.impl;

import com.example.demo.service.ConditionListener;
import org.springframework.stereotype.Service;


public class LinuxCommand implements ConditionListener {
    @Override
    public String showCommand() {
        return "linux";
    }
}
