package com.ebaotech.salesplatform.core.bo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

/**
 * Created by haydn.chen on 3/9/2016.
 */
@DatabaseTable(tableName = "t_family_member")
public class FamilyMemberBo {
  @DatabaseField(generatedId = true)
  private Integer id;
  @DatabaseField
  private String relationToPh;
  @DatabaseField
  private String name;
  @DatabaseField
  private String gender;
  @DatabaseField
  private Date birthday;
  @DatabaseField
  private Integer age;
  @DatabaseField
  private String mobile;
  @DatabaseField
  private String occupation;
  @DatabaseField
  private String email;
  @DatabaseField(foreign = true, foreignAutoRefresh = true,columnName="customer_id")
  private CustomerBo customer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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

  public CustomerBo getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerBo customer) {
    this.customer = customer;
  }
}
