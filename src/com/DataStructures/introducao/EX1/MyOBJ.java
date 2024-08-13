package com.DataStructures.introducao.EX1;

public class MyOBJ {

    private Integer num;

    public MyOBJ(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyOBJ{" +
                "num=" + num +
                '}';
    }
}
