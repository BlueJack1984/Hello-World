package com.example.demo.service.impl;

import com.example.demo.service.ConditionListener;
import org.springframework.stereotype.Service;

public class WindowsCommand implements ConditionListener {
    @Override
    public String showCommand() {
        System.out.println("windows");
        return "windows";
    }
}
