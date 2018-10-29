package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.service.AsyncTaskService;
import com.example.demo.service.ConditionListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Student student;
    @Autowired
    private AsyncTaskService asyncTaskService;
    @Autowired
    private ConditionListener conditionListener;

    @Test
    public void contextLoads() {
    }

    @Test
    public void profilesTest() {
        System.out.println(student.getName());
        System.out.println(student.getAge());
        for(int i = 0; i < 10; i ++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        //System.out.println();
    }

    @Test
    public void ConditionTest() {
        String system = conditionListener.showCommand();
        //System.out.println(system);
    }
}
