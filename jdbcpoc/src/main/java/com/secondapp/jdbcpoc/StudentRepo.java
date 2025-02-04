package com.secondapp.jdbcpoc;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(student s){
        System.out.println("Added");
        String sql="insert into student(rollno,sname,marks) values(?,?,?)";
        jdbc.update(sql, s.getRollNo(),s.getName(),s.getMarks());
    }

    public List<student> extract() {
        String sql="select * from student";
        RowMapper<student> mapper = new RowMapper<student>() {
            @Override
            public student mapRow(@SuppressWarnings("null") ResultSet rs, int rowNum) throws SQLException {
                student s = new student();
                s.setName(rs.getString("sname"));
                s.setMarks(rs.getInt("marks"));
                s.setRollNo(rs.getInt("rollno"));
                return s;
            }
        };
        
        return jdbc.query(sql,mapper);
    }
}
