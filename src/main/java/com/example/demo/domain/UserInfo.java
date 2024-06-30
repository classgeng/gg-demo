package com.example.demo.domain;

public class UserInfo {

    public UserInfo(String id, String name){
        this.id = id;
        this.name = name;
    }

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
