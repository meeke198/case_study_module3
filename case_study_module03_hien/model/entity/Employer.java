package com.codegym.case_study_module03_hien.model.entity;

import java.util.Date;

public class Employer {
    private Integer id;
    private String name;
    private Date DOB;
    private String address;
    private String phoneNumber;
    private String email;
    private Integer role_id;
    boolean status;

    public Employer(Integer id, String name, Date DOB, String address, String phoneNumber, String email, Integer role_id, boolean status) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.role_id = role_id;
        this.status = status;
    }

    public Employer( String name, Date DOB, String address, String phoneNumber, String email, Integer role_id, boolean status) {
        this.name = name;
        this.DOB = DOB;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.role_id = role_id;
        this.status = true;
    }

    public Employer() {
    }

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

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", role_id=" + role_id +
                ", status=" + status +
                '}';
    }
}
