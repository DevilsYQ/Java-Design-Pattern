package com.devil.test;
import com.fullshare.Application;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;



import java.lang.reflect.InvocationTargetException;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
@ActiveProfiles("development")
@Transactional
@SuppressWarnings("all")
public class test {
    @Test
    public void testSet() throws IllegalAccessException, InvocationTargetException, InstantiationException, CloneNotSupportedException {
    }
}