package com.ebaotech.salesplatform.domain;

public class Customer {

    public final String id;
    public final String name;
    public final int age;
    public final String gender;
    public final String details;

    public Customer(String id, String name, int age, String gender, String details) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.details = details;
    }

    @Override
    public String toString() {
        return name;
    }
}
