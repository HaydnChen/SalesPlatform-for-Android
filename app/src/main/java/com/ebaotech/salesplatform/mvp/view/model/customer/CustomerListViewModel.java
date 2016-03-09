package com.ebaotech.salesplatform.mvp.view.model.customer;

public class CustomerListViewModel {

    private String id;
    private String name;
    private int age;
    private String gender;
    private String details;

    public CustomerListViewModel() {
    }

    public CustomerListViewModel(String id, String name, int age, String gender, String details) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.details = details;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDetails(String details) {
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
