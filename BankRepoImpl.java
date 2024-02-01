package com.xworkz.bankApp.repository;

import com.xworkz.bankApp.dto.BankDto;
import com.xworkz.bankApp.utils.BankUtils;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BankRepoImpl implements BankRepo{

    @Override
    public boolean validateAndSave(BankDto dto) {
        Connection connection = BankUtils.getConnection();
        String query = "Insert into bank values(?,?,?,?,?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1 , dto.getId());
            statement.setString(2,dto.getName());
            statement.setLong(3,dto.getContactNumber());
            statement.setString(4,dto.getBankType());
            statement.setString(5,dto.getEmail());
            int rowsAffected = statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    @Override
    public BankDto findById(int id) {
        Connection connection = BankUtils.getConnection();
        String query = "select * from bank where id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);

            ResultSet set = statement.executeQuery();

            BankDto dto = new BankDto();
            while (set.next()) {
                int returnedId = set.getInt("id");
                String name = set.getString("name");
                Long contactNumber = set.getLong("contactNumber");
                String bankType = set.getString("bankType");
                String  email = set.getString("email");

                dto.setId(returnedId);

                dto.setName(name);

                dto.setContactNumber(contactNumber);

                dto.setBankType(bankType);

                dto.setEmail(email);

            }
            return dto;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public BankDto findByName(String name) {
        Connection connection = BankUtils.getConnection();
        String query = "select * from bank where name = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, name);

            ResultSet set = statement.executeQuery();

            BankDto dto = new BankDto();
            while (set.next()) {
                int returnedId = set.getInt("id");
                String returnedName = set.getString("name");
                Long contactNumber = set.getLong("contactNumber");
                String bankType = set.getString("bankType");
                String  email = set.getString("email");

                dto.setId(returnedId);

                dto.setName(returnedName);

                dto.setContactNumber(contactNumber);

                dto.setBankType(bankType);

                dto.setEmail(email);

            }
            return dto;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateNameById(int id, String name) {
        Connection connection = BankUtils.getConnection();

        String query = "update bank set name = ? where id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,name);
            statement.setInt(2,id);
            int rowsAffected = statement.executeUpdate();
            System.out.println(rowsAffected);
            if (rowsAffected >0){
                return  true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
        Connection connection = BankUtils.getConnection();
        String query = "delete from bank where name = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1 , name);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected >0){
                return  true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public List<BankDto> readAll() {
        Connection connection = BankUtils.getConnection();
        String query = "select * from bank ";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();

            List<BankDto> list = new ArrayList<BankDto>();

            while (set.next()){
                int id = set.getInt("id");
                String name = set.getString("name");
                Long contactNumber = set.getLong("contactNumber");
                String bankType = set.getString("bankType");
                String  email = set.getString("email");

                BankDto dto = new BankDto(id , name , contactNumber , bankType , email);
                System.out.println(dto);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
