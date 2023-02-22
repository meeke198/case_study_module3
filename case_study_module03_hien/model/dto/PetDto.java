//package com.codegym.case_study_module03_hien.model.dto;
//
//import java.sql.Date;
//
//public class PetDto {
//    private Integer id;
//    private Integer owner_id;
//    private String name;
//    private Date DOB;
//    private String species;
//    private String breed;
//    private String health_status;
//    private String pet_image;
//
//    public void setOwner_id(Integer owner_id) {
//        this.owner_id = owner_id;
//    }
//
//
//    boolean status;
//
//    public PetDto(Integer id, Integer owner_id, String name, Date DOB, String species, String breed, String health_status, String pet_image) {
//        this.id = id;
//        this.owner_id = owner_id;
//        this.name = name;
//        this.DOB = DOB;
//        this.species = species;
//        this.breed = breed;
//        this.health_status = health_status;
//        this.pet_image = pet_image;
//        this.status = true;
//    }
//
//    public PetDto(String name, String species, String breed, String health_status, String pet_image) {
//        this.name = name;
//        this.species = species;
//        this.breed = breed;
//        this.health_status = health_status;
//        this.pet_image = pet_image;
//        this.status = true;
//    }
//
//    public PetDto(Integer owner_id, String name, Date DOB, String species, String breed, String health_status, String pet_image) {
//        this.owner_id = owner_id;
//        this.name = name;
//        this.DOB = DOB;
//        this.species = species;
//        this.breed = breed;
//        this.pet_image = pet_image;
//        this.health_status = health_status;
//        this.status = true;
//    }
//
//    public PetDto() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public int getOwner_id() {
//        return owner_id;
//    }
//
//    public void setOwner_id(int owner_id) {
//        this.owner_id = owner_id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getDOB() {
//        return DOB;
//    }
//
//    public void setDOB(Date DOB) {
//        this.DOB = DOB;
//    }
//
//    public String getSpecies() {
//        return species;
//    }
//
//    public void setSpecies(String species) {
//        this.species = species;
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }
//
//    public String getHealth_status() {
//        return health_status;
//    }
//
//    public void setHealth_status(String health_status) {
//        this.health_status = health_status;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//    public String getPet_image() {
//        return pet_image;
//    }
//
//    public void setPet_image(String pet_image) {
//        this.pet_image = pet_image;
//    }
//
//    @Override
//    public String toString() {
//        return "Pet{" +
//                "id=" + id +
//                ", owner_id=" + owner_id +
//                ", service_id=" +
//                ", name='" + name + '\'' +
//                ", DOB=" + DOB +
//                ", species='" + species + '\'' +
//                ", breed='" + breed + '\'' +
//                ", pet_image='" + pet_image + '\'' +
//                ", health_status='" + health_status + '\'' +
//                ", status=" + status +
//                '}';
//    }
//}
