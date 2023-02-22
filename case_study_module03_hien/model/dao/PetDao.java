//package com.codegym.case_study_module03_hien.model.dao;
//
//import com.codegym.case_study_module03_hien.connection.JdbcConnection;
////import com.codegym.case_study_module03_hien.model.dto.OwnerDto;
//import com.codegym.case_study_module03_hien.model.dto.PetDto;
//import com.codegym.case_study_module03_hien.model.entity.Pet;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.LinkedList;
//import java.util.List;
//
//public class PetDao {
//    private List<PetDto> petDtos = null;
//    public List<PetDto> getAll() {
//        petDtos = new LinkedList<>();
//        try {
//            Connection connection = JdbcConnection.getConnection();
//            String query = "SELECT * from pets;";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                PetDto petDto = new PetDto();
//                petDto.setId(resultSet.getInt("id"));
//                petDto.setOwner_id(resultSet.getInt("owner_id"));
//                petDto.setName(resultSet.getString("name"));
//                petDto.setDOB(resultSet.getDate("DOB"));
//                petDto.setSpecies(resultSet.getString("species"));
//                petDto.setBreed(resultSet.getString("breed"));
//                petDto.setHealth_status(resultSet.getString("health_status"));
//                petDtos.add(petDto);
//            }
//            connection.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return petDtos;
//    }
//
//    public PetDto get(Integer id) {
//        try {
//            Connection connection = JdbcConnection.getConnection();
//            String query = "SELECT * FROM pets WHERE owner_id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                PetDto petDto = new PetDto();
//                petDto.setId(resultSet.getInt("id"));
//                petDto.setOwner_id(resultSet.getInt("owner_id"));
//                petDto.setName(resultSet.getString("name"));
//                petDto.setDOB(resultSet.getDate("DOB"));
//                petDto.setSpecies(resultSet.getString("species"));
//                petDto.setBreed(resultSet.getString("breed"));
//                petDto.getPet_image(resultSet.getString("pet_image"));
//                petDto.setHealth_status(resultSet.getString("health_status"));
//                return petDto;
//            }
//            connection.close();
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//        return new PetDto();
//    }
//
//    public void insert(PetDto petDto){
//        try{
//            if(petDto.getId() != null){
//                System.out.println("Pet exists!");
//                return;
//            }
//            Connection connection = JdbcConnection.getConnection();
//            String query = "INSERT INTO pets (owner_id, name, DOB, species, breed, health_status)" +
//                    "VALUES(?, ?, ?, ?, ?, ?)\";";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, petDto.getOwner_id());
//            preparedStatement.setString(2, petDto.getName());
//            preparedStatement.setDate(3, petDto.getDOB());
//            preparedStatement.setString(4, petDto.getSpecies());
//            preparedStatement.setString(5, petDto.getBreed());
//            preparedStatement.setString(6, petDto.getHealth_status());
//
//            if(preparedStatement.executeUpdate() > 0) {
//                System.out.println("Added pet successfully.");
//            } else {
//                System.out.println("Failed to insert pet.");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//    public void update(PetDto petDto) {
//        try {
//            Connection connection = JdbcConnection.getConnection();
//            String query = "UPDATE pets " +
//                    "SET owner_id = ?, name = ?, DOB = ?, spieces = ?, " +
//                    "breed = ?, health_status = ?;";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, petDto.getOwner_id());
//            preparedStatement.setString(2, petDto.getName());
//            preparedStatement.setDate(3, petDto.getDOB());
//            preparedStatement.setString(4, petDto.getSpecies());
//            preparedStatement.setString(5, petDto.getBreed());
//            preparedStatement.setString(6, petDto.getHealth_status());
//
//
//            if(preparedStatement.executeUpdate() > 0) {
//                System.out.println("Edited user successfully.");
//            } else {
//                System.out.println("Failed to edit user.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public void delete(Integer id) {
//        try {
//            Connection connection = JdbcConnection.getConnection();
//            String query = "DELETE FROM pets WHERE id = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setInt(1, id);
//
//            if(preparedStatement.executeUpdate() > 0) {
//                System.out.println("Removed pet successfully.");
//            } else {
//                System.out.println("Failed to remove pet.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
