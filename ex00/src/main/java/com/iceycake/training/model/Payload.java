package com.iceycake.training.model;

import java.io.Serializable;

public class Payload implements Serializable {
    
    private String name;
    private int value;
    private String desc;

    public Payload() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
