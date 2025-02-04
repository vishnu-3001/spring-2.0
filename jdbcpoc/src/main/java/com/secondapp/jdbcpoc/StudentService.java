package com.secondapp.jdbcpoc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(student s){
        repo.save(s);
    }
    public List<student> getStudents() {
        return repo.extract();
    }
}
