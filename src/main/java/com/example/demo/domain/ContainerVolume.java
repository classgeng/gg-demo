package com.example.demo.domain;

import com.example.demo.domain.VolumeItem;

import java.io.Serializable;
import java.util.List;

/**
 * 容器卷挂载信息
 * @author xfenggeng
 * @date 2021/9/1 15:30
 */
public class ContainerVolume implements Serializable {
    /**
     *  ConfigMap holds configuration data for pods to consume.
     *  ConfigMap保存POD要使用的配置数据
     */
    private List<VolumeItem> configMap;

    /**
     *  Secret holds secret data of a certain type.
     *  Secret保存某种类型的秘密数据。
     */
    private List<VolumeItem> secret;

    /**
     *  PersistentVolumeClaim is a user's request for and claim to a persistent volume.
     *  PersistentVolumeClaim是用户对持久卷的请求和声明。
     */
    private List<VolumeItem> persistentVolumeClaim;

    public List<VolumeItem> getConfigMap() {
        return configMap;
    }

    public void setConfigMap(List<VolumeItem> configMap) {
        this.configMap = configMap;
    }

    public List<VolumeItem> getSecret() {
        return secret;
    }

    public void setSecret(List<VolumeItem> secret) {
        this.secret = secret;
    }

    public List<VolumeItem> getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(List<VolumeItem> persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }
}
