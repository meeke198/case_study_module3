package com.codegym.case_study_module03_hien.model.entity;
import java.sql.Date;
public class Pet {
    private Integer id;
    private Integer owner_id;
    private String name;
    private Date DOB;
    private String species;
    private String breed;
    private String health_status;
    private String pet_image;
    boolean status;

    public String getPet_image() {
        return pet_image;
    }

    public void setPet_image(String pet_image) {
        this.pet_image = pet_image;
    }

    public Pet(Integer id, String name, Date DOB, String species, String breed, Integer owner_id, String health_status, String pet_image) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.species = species;
        this.breed = breed;
        this.owner_id = owner_id;
        this.health_status = health_status;
        this.pet_image = pet_image;
        this.status = true;
    }

    public Pet(String name, String species, String breed, String health_status) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.health_status = health_status;
        this.status = true;
    }

    public Pet( String name, Date DOB, String species, String breed, String health_status, Integer owner_id) {
        this.owner_id = owner_id;
        this.name = name;
        this.DOB = DOB;
        this.species = species;
        this.breed = breed;
        this.health_status = health_status;
        this.status = true;
    }

    public Pet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHealth_status() {
        return health_status;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", owner_id=" + owner_id +
                ", service_id=" +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", health_status='" + health_status + '\'' +
                ", pet_image='" + pet_image + '\'' +
                ", status=" + status +
                '}';
    }
}
