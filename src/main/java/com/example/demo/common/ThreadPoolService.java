package com.example.demo.common;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolService {

    public static void test() {

        ConcurrentHashMap map = new ConcurrentHashMap();

        ExecutorService threadPoolService = Executors.newFixedThreadPool(10);
        
    }

}
