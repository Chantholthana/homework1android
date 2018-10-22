package com.android.btb_003.homework01;

import java.io.Serializable;

public class Student implements Serializable{
    private String name,phone,className;

    public Student(String name, String phone, String className) {
        this.name = name;
        this.phone = phone;
        this.className = className;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
