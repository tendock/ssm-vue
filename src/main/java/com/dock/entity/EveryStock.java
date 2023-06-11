package com.dock.entity;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 21:48
 * @version:1.0
 */
public class EveryStock {
    private Integer value;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "EveryStock{" +
            "name='" + name + '\'' +
            ", value=" + value +
            '}';
    }
}
