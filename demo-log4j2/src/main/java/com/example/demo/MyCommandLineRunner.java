package com.example.demo;

import com.example.demo.owen.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private HelloService service;

    @Override
    public void run(String... args) throws Exception {
        log.info("rs = {}",service.hello("Owen"));
    }
}