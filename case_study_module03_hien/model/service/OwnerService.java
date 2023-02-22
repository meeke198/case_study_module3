package com.codegym.case_study_module03_hien.model.service;

import com.codegym.case_study_module03_hien.model.dao.OwnerDao;
import com.codegym.case_study_module03_hien.model.dto.OwnerDto;
import com.codegym.case_study_module03_hien.model.entity.Owner;
//mport org.mindrot.jbcrypt.BCrypt;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class OwnerService {
    private OwnerDao ownerDao = null;
    public OwnerService(){
        ownerDao = new OwnerDao();
    }
    public List<OwnerDto> findAll() {
        List<OwnerDto> ownerDtos = new ArrayList<>();
        List<Owner> onwerList = ownerDao.getAll();
        onwerList.forEach(owner -> ownerDtos.add(new OwnerDto(owner.getId(),  owner.getName(), owner.getGender(), owner.getDOB(),owner.getAddress(), owner.getPhoneNumber(), owner.getEmail())));
        return ownerDtos;
    }

    public OwnerDto find(Integer id) {
        return ownerDao.get(id);
    }

    public void add(OwnerDto ownerDto) {
        Owner newOwner = new Owner(ownerDto.getGender(), ownerDto.getName(),ownerDto.getDOB(),
                ownerDto.getAddress(), ownerDto.getPhoneNumber(), ownerDto.getEmail());
        ownerDao.insert(newOwner);
    }

    public void edit(OwnerDto ownerDto) {
        Owner owner = new Owner(ownerDto.getId(), ownerDto.getGender(), ownerDto.getName(),
                ownerDto.getDOB(), ownerDto.getAddress(), ownerDto.getPhoneNumber(), ownerDto.getEmail());
        ownerDao.update(owner);
    }

    public void remove(Integer id) {
        ownerDao.delete(id);
    }
}
