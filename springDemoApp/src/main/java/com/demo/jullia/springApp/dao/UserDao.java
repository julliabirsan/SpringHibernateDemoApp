package com.demo.jullia.springApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void save(String email, String password){
        jdbcTemplate.update("insert into user values(null, ?,?)", email, password);
    }

    public List<User> findByEmail(String email){
        return jdbcTemplate.query("select * from user where email = '" + email + "';", new UserRowMapper());
    }
}
