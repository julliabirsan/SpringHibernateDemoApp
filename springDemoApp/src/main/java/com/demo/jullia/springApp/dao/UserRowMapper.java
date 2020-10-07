package com.demo.jullia.springApp.dao;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User u = new User();
        u.setId(resultSet.getInt("id"));
        u.setEmail(resultSet.getString("email"));
        u.setPassword(resultSet.getString("password"));
        return u;
    }
}
