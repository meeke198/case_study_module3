package com.codegym.case_study_module03_hien.model.entity;

import java.sql.Date;

public class Appointment {
    private Integer id;
    private Date date;
    private int hour;
    private int minute;
    private Integer customer_id;
    private Integer pet_id;
    private Integer service_id;

    public Appointment(Integer id, Date date, int hour, int minute, Integer customer_id, Integer pet_id, Integer service_id) {
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.minute = minute;
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
    }

    public Appointment(Date date, int hour, int minute, Integer customer_id, Integer pet_id, Integer service_id) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
    }

    public Appointment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public Integer getService_id() {
        return service_id;
    }

    public void setService_id(Integer service_id) {
        this.service_id = service_id;
    }


    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date=" + date +
                ", hour=" + hour +
                ", minute=" + minute +
                ", customer_id=" + customer_id +
                ", pet_id=" + pet_id +
                ", service_id=" + service_id +
                '}';
    }
}
