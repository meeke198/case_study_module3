//package com.codegym.case_study_module03_hien.model.service;
//
//import com.codegym.case_study_module03_hien.model.dao.OwnerDao;
////import com.codegym.case_study_module03_hien.model.dao.PetDao;
////import com.codegym.case_study_module03_hien.model.dto.PetDto;
//import com.codegym.case_study_module03_hien.model.dto.OwnerDto;
//
//import java.util.List;
//
//public class PetService {
//    private PetDao petDao = null;
//    public PetService(){
//        petDao = new PetDao();
//    }
//    public List<PetDto> findAll() {
//        return petDao.getAll();
//    }
//
//    public PetDto find(Integer id) {
//        return petDao.get(id);
//    }
//
//    public void add(PetDto petDto) {
//        PetDto newPetDto = new PetDto(petDto.getOwner_id(), petDto.getName(),petDto.getDOB(),
//                petDto.getSpecies(), petDto.getBreed(), petDto.getHealth_status());
//        petDao.insert(newPetDto);
//    }
//
//    public void edit(PetDto petDto) {
//        PetDto editPetDto = new PetDto(petDto.getOwner_id(), petDto.getName(),petDto.getDOB(),
//                petDto.getSpecies(), petDto.getBreed(), petDto.getHealth_status());
//        petDao.update(editPetDto);
//    }
//
//    public void remove(Integer id) {
//        petDao.delete(id);
//    }
//}
