package com.codegym.case_study_module03_hien.model.entity;

import java.util.Date;

public class Invoice {
    private Integer id;
    private Integer customer_id;
    private Integer pet_id;
    private Integer service_id;
    private Date pay_date;

    public Invoice(Integer id, Integer customer_id, Integer pet_id, Integer service_id, Date pay_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
        this.pay_date = pay_date;
    }


    public Invoice(Integer customer_id, Integer pet_id, Integer service_id, Date pay_date) {
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
        this.pay_date = pay_date;
    }

    public Invoice() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getPay_date() {
        return pay_date;
    }

    public void setPay_date(Date pay_date) {
        this.pay_date = pay_date;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", pet_id=" + pet_id +
                ", service_id=" + service_id +
                ", pay_date=" + pay_date +
                '}';
    }
}
