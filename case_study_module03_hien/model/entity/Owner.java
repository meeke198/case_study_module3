package com.codegym.case_study_module03_hien.model.entity;
import java.sql.Date;

public class Owner {
    private Integer id;
    private String gender;
    private String name;
    private Date DOB;
    private String address;
    private String phoneNumber;
    private String email;
//    private Integer role_id;
    boolean status;
    public Owner(){
        this.status = true;
    }

    public Owner(Integer id, String gender, String name, Date DOB, String address, String phoneNumber, String email) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.DOB = DOB;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = true;
    }


    public Owner(String gender, String name, Date DOB, String address, String phoneNumber, String email) {
        this.gender = gender;
        this.name = name;
        this.DOB = DOB;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = true;
    }
    public Owner(Integer id,String name, String gender, String address, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = true;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
