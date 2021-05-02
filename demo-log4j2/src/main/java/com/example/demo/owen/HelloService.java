package com.example.demo.owen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloService {
    public String hello(String name){
        log.info("Info: Call hello service with name={}",name);
        log.warn("warn: Call hello service with name={}",name);
        return "Hello "+name;
    }
}
