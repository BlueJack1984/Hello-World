package com.example.demo;

import com.example.demo.config.ConditionConfig;
import com.example.demo.config.ProfileConfig;
import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConditionConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    @Autowired
    private User user;
    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = user.getName();
        Assert.assertEquals(expected, actual);
        System.out.println();
    }

}
