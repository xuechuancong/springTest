package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:jdbc.xml")
public class ServiceImplTest {

    @Resource(name = "service")
    private AccountService service;


    @Test
    public void transfer() throws Exception {

        service.transfer("aaa", "bbb", 120d);

    }

}