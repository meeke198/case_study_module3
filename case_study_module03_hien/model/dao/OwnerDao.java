package com.codegym.case_study_module03_hien.model.dao;

import com.codegym.case_study_module03_hien.connection.JdbcConnection;
import com.codegym.case_study_module03_hien.model.dto.OwnerDto;
//import com.codegym.case_study_module03_hien.model.dto.PetDto;
import com.codegym.case_study_module03_hien.model.entity.Owner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.sql.Date;


public class OwnerDao {
    private List<Owner> owners;

    public List<Owner> getAll() {

        owners = new LinkedList<>();
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "SELECT * from owners;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Owner owner= new Owner();
                owner.setId(resultSet.getInt("id"));
                owner.setName(resultSet.getString("name"));
                owner.setDOB(resultSet.getDate("DOB"));
                owner.setGender(resultSet.getString("gender"));
                owner.setAddress(resultSet.getString("address"));
                owner.setPhoneNumber(resultSet.getString("phoneNumber"));
                owner.setEmail(resultSet.getString("email"));
                owners.add(owner);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return owners;
    }

    public OwnerDto get(Integer id) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "SELECT * FROM owners WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                OwnerDto ownerDto = new OwnerDto();
                ownerDto.setId(resultSet.getInt("id"));
                ownerDto.setName(resultSet.getString("name"));
                ownerDto.setDOB(resultSet.getDate("DOB"));
                ownerDto.setGender(resultSet.getString("gender"));
                ownerDto.setAddress(resultSet.getString("address"));
                ownerDto.setPhoneNumber(resultSet.getString("phoneNumber"));
                ownerDto.setEmail(resultSet.getString("email"));
                return ownerDto;
            }
            connection.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new OwnerDto();
    }
// public PetDto getPet(Integer id) {
//        try {
//            Connection connection = JdbcConnection.getConnection();
//            String query = "SELECT * FROM owners WHERE id=?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                OwnerDto petDto = new OwnerDto();
//                ownerDto.setId(resultSet.getInt("id"));
//                ownerDto.setName(resultSet.getString("name"));
//                ownerDto.setDOB(resultSet.getDate("DOB"));
//                ownerDto.setGender(resultSet.getString("gender"));
//                ownerDto.setAddress(resultSet.getString("address"));
//                ownerDto.setPhoneNumber(resultSet.getString("phoneNumber"));
//                ownerDto.setEmail(resultSet.getString("email"));
//                return petDto;
//            }
//            connection.close();
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//        return new OwnerDto();
//    }

    public void insert(Owner owner){
        try{
//            if(owner.getId() != null){
//                System.out.println("Owner exists!");
//                return;
//            }
            Connection connection = JdbcConnection.getConnection();
            String query = "INSERT INTO owners (gender, name, DOB, address, phoneNumber,email) VALUES(?, ?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, owner.getGender());
            preparedStatement.setString(2, owner.getName());
            preparedStatement.setDate(3, owner.getDOB());
            preparedStatement.setString(4, owner.getAddress());
            preparedStatement.setString(5, owner.getPhoneNumber());
            preparedStatement.setString(6, owner.getEmail());

            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("Added owner successfully.");
            } else {
                System.out.println("Failed to insert owner.");
            }
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void update(Owner owner) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "UPDATE owners " +
                    "SET gender = ?, name = ?, DOB = ?, address = ?, " +
                    "phoneNumber = ?, email = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, owner.getGender());
            preparedStatement.setString(2, owner.getName());
            preparedStatement.setDate(3, owner.getDOB());
            preparedStatement.setString(4, owner.getAddress());
            preparedStatement.setString(5, owner.getPhoneNumber());
            preparedStatement.setString(6, owner.getEmail());
            preparedStatement.setInt(7, owner.getId());

            if(preparedStatement.executeUpdate() > 0) {
                System.out.println("Edited user successfully.");
            } else {
                System.out.println("Failed to edit user.");
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(Integer id) {
        try {
            Connection connection = JdbcConnection.getConnection();
            String query = "DELETE FROM pets WHERE owner_id = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            String query2 = "DELETE FROM owners WHERE id = ?;";
            PreparedStatement pre = connection.prepareStatement(query2);
            connection.prepareStatement(query2);
            pre.setInt(1, id);
            if(pre.executeUpdate() > 0) {
                System.out.println("Removed owner successfully.");
            } else {
                System.out.println("Failed to remove owner.");
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
