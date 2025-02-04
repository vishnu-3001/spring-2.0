package com.secondapp.jdbcpoc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class student {
    private int rollNo;
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int marks;
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
    }
    
}
