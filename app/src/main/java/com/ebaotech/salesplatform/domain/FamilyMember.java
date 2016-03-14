package com.ebaotech.salesplatform.domain;

import java.util.Date;

/**
 * Created by haydn.chen on 3/9/2016.
 */
public class FamilyMember {
  private String id;
  private String relationToPh;
  private String name;
  private String gender;
  private Date birthday;
  private Integer age;
  private String mobile;
  private String occupation;
  private String email;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRelationToPh() {
    return relationToPh;
  }

  public void setRelationToPh(String relationToPh) {
    this.relationToPh = relationToPh;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
