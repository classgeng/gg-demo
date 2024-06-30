package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class MainTest {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String objectToString(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    public static <T> T stringToObject(String json,Class<T> object) throws IOException {
        return objectMapper.readValue(json,object);
    }

    public static void main(String[] args) throws JsonProcessingException {

        List<String> ipAndPort = new ArrayList<>();
        String ss = "127.0.0.1:8081,127.0.0.2:8082,127.0.0.3:8083";
        String[] arrays = ss.split(",");
        for (String server:arrays) {
            ipAndPort.add(server);
        }
        System.out.println(ipAndPort);
    }

    /**
     * 正则检验
     */
    public static void regex(){
        //String VOLUME_NAME_REGEX = "^(?!-)(?!.*?-$)[a-z0-9\\-]{0,60}$";
        String IP_REGEX = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?):\\/(?:[-a-zA-Z0-9_.]+\\/?)*$";

        boolean flag = Pattern.matches(IP_REGEX, "172.16.16.61:/var/nfs");
        System.out.println(flag);
    }

}
