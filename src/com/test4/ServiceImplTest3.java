package com.test4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:jdbc4.xml")
public class ServiceImplTest3 {

    @Resource(name = "service")
    private AccountService service;
    @Test
    public void transfer() throws Exception {
        service.transfer("aaa", "bbb", 120d);
    }

}