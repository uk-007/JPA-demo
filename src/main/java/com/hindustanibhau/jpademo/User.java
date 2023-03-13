package com.hindustanibhau.jpademo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                         //to tell spring framework that this is the class(here user) of which table is to created
@Table(name="user_info")
public class User {
    @Id                           //setting primary key
    @Column(name="id")            //setting column name from roll no to id (optional)
    int rollNo;
    String name;
    int age;
    int mobNo;

    public User(int rollNo, String name, int age, int mobNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }
    public User(){

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }
}
