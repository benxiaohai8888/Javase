package com.doctor;
//instanceof 关键字
public abstract class Doctor {
    private String name;//姓名

    public Doctor(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //抽象看病方法
    public abstract void watch();
}
