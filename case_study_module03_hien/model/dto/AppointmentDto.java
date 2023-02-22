package com.codegym.case_study_module03_hien.model.dto;

import java.util.Date;

public class AppointmentDto {
    private int id;
    private Date date;
    private int hour;
    private int minute;
    private int customer_id;
    private int pet_id;
    private int service_id;

    public AppointmentDto(int id, Date date, int hour, int minute, int customer_id, int pet_id, int service_id) {
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.minute = minute;
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
    }

    public AppointmentDto(Date date, int hour, int minute, int customer_id, int pet_id, int service_id) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
    }

    public AppointmentDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
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
