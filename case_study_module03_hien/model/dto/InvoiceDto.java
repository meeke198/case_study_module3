package com.codegym.case_study_module03_hien.model.dto;

import java.util.Date;

public class InvoiceDto {
    private int id;
    private int customer_id;
    private int pet_id;
    private int service_id;
    private Date pay_date;

    public InvoiceDto(int id, int customer_id, int pet_id, int service_id, Date pay_date) {
        this.id = id;
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
        this.pay_date = pay_date;
    }


    public InvoiceDto(int customer_id, int pet_id, int service_id, Date pay_date) {
        this.customer_id = customer_id;
        this.pet_id = pet_id;
        this.service_id = service_id;
        this.pay_date = pay_date;
    }

    public InvoiceDto() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
