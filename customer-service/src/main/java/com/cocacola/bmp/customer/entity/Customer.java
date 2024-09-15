package com.cocacola.bmp.customer.entity;


public class Customer {
    public  Long id;

    public Customer() {
    }

    public Customer(Long id, String name, String email, String channel) {
        this.id = id;
        this.name = name;
        this.channel = channel;
        this.email = email;
    }

    public String name;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String channel;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String email;

    public Customer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
