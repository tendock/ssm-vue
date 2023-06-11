package com.dock.dto;

/**
 * @author:XuJianYuan
 * @date:2023/6/9 11:37
 * @version:1.0
 */
public class StockDto {
    private String name;
    private Integer in;
    private Integer out;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIn() {
        return in;
    }

    public void setIn(Integer in) {
        this.in = in;
    }

    public Integer getOut() {
        return out;
    }

    public void setOut(Integer out) {
        this.out = out;
    }

    @Override
    public String toString() {
        return "StockDto{" +
            "name='" + name + '\'' +
            ", in=" + in +
            ", out=" + out +
            '}';
    }
}
