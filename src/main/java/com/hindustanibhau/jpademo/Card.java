package com.hindustanibhau.jpademo;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //here we don't want to take primary key as input therefore card no will automatically
                                                        //gets increases in table with every input data
    private int cardNo;

    @Column(nullable = false,unique = true)         //if we want to make any column(other than primary) to unique,null etc
    private String dob;

    @Enumerated(EnumType.STRING)                    //setting status as string type  in table because sql don't know what is enums
    private Status status;

    @OneToOne                   //because card to user relation is one to one
    @JoinColumn                //to create foreign key column in table. Join based on primary key by default. has to be written in child class
    User user;                 //because we want to relate card class to user class

    public Card(int cardNo, String dob, Status status, User user) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
        this.user = user;
    }
    public Card(){

    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
