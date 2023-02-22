package com.codegym.case_study_module03_hien;

import com.codegym.case_study_module03_hien.model.dao.OwnerDao;
import com.codegym.case_study_module03_hien.model.dto.OwnerDto;
import com.codegym.case_study_module03_hien.model.entity.Owner;
import com.codegym.case_study_module03_hien.model.service.OwnerService;

import java.sql.Date;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet  {
    public static void main(String[] args) {
//        OwnerDao ownerDao = new OwnerDao();


////        OwnerDto ownerDto = new OwnerDto()
                Date date = Date.valueOf("2023-02-18");
//        ownerDao.update(new Owner(1, "name", "gender", date, "address", "phoneNumber", "email"));
        OwnerService ownerService = new OwnerService();
        ownerService.edit(new OwnerDto(1, "Thu Hien", "SFASDFASDFASFDASFDFDS", date, "Doong NAis", "phonasdfasd", "sadfasdfsdf@sdfas.com"));
        for(OwnerDto ownerDto: ownerService.findAll()){
            System.out.println(ownerDto);
        }
        ownerService.find(1);
        System.out.println(ownerService.find(1));
    }
}