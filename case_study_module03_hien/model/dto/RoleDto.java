package com.codegym.case_study_module03_hien.model.dto;

public class RoleDto {
    private int id;
    private String role;

    public RoleDto(int id, String role) {
        this.id = id;
        this.role = role;
    }

    public RoleDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}
