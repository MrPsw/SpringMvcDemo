package cn.itcast.entity;

import java.util.Date;

public class User {
    private String name;
    private int age;
    private Date date;


    public User() {
    }

    public User(String name, int age, Date date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
