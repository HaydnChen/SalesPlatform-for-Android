package com.ebaotech.salesplatform.domain;

public class Customer {

    private String id;
    private String name;
    private int age;
    private String gender;
    private String details;

    public Customer(String id, String name, int age, String gender, String details) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return name;
    }
}
