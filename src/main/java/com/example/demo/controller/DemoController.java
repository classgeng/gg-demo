package com.example.demo.controller;

import com.example.demo.common.JvmCache;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.IDemoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    public IDemoService demoService;

    @RequestMapping("/helloWord")
    public String helloWord(String name,int age) {
        log.info("name:{}, age:{}",name, age);
        return demoService.helloWord(name,age);
    }

    @RequestMapping("/oom")
    public String oom(String name) {
        log.info("name:{}",name);
        demoService.oom();
        return name + " hello word!";
    }


}
