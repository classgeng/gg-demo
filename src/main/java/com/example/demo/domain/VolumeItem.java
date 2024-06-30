package com.example.demo.domain;

import java.io.Serializable;

/**
 * 容器卷挂载信息
 * @author xfenggeng
 * @date 2021/9/1 15:30
 */
public class VolumeItem implements Serializable {

    /**
     * 名称
     */
    private String name;

    public VolumeItem(){}

    public VolumeItem(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
