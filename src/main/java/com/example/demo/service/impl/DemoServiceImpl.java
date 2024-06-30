package com.example.demo.service.impl;

import com.example.demo.common.UUIDUtils;
import com.example.demo.domain.UserInfo;
import com.example.demo.service.IDemoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Log4j2
@Service
public class DemoServiceImpl implements IDemoService {

    private int temp = 18;

    @Override
    public String helloWord(String name,int age) {
        log.info("name:{}, age:{}", name, age);
        age = temp+age;
        return "name:"+name+",age:"+age;
    }

    @Override
    public void oom() {
        List<UserInfo> list = new ArrayList<>();
        int i = 0;
        while(true){
            log.info("oom i: {}", i++);
            list.add(new UserInfo(UUIDUtils.getUUID(),UUIDUtils.getUUID()));
        }
    }

}
