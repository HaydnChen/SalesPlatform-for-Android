package com.ebaotech.salesplatform.core.bo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@DatabaseTable(tableName = "t_customer")
public class CustomerBo {
    @DatabaseField(generatedId = true)
    private Integer id;
    @DatabaseField
    private String name;
    @DatabaseField
    private String title;
    @DatabaseField
    private Date birthday;
    @DatabaseField
    private Integer age;
    @DatabaseField
    private String gender;
    @DatabaseField
    private String country;
    @DatabaseField
    private String occupation;
    @DatabaseField
    private String comments;
    @DatabaseField
    private String idType;
    @DatabaseField
    private String idNumber;
    @DatabaseField
    private String maritalStatus;
    @DatabaseField
    private String mobile;
    @DatabaseField
    private String email;
    @DatabaseField
    private String phone;
    @ForeignCollectionField(eager = true)
    private Collection<AddressBo> addresses;
    @ForeignCollectionField(eager = true)
    private Collection<FamilyMemberBo> familyMembers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Collection<AddressBo> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<AddressBo> addresses) {
        this.addresses = addresses;
    }

    public Collection<FamilyMemberBo> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Collection<FamilyMemberBo> familyMembers) {
        this.familyMembers = familyMembers;
    }
}
