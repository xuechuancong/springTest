package com.test1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:jdbc2.xml")
public class ServiceImplTest {

//    @Resource(name = "service")
    @Resource(name = "accountServiceProxy")
    private AccountService service;



    @Test
    public void transfer() throws Exception {
        service.transfer("aaa", "bbb", 54d);
    }

}