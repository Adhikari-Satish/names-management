package com.nec.entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private int roll;

    private String name;

    
    public Student() {
    	
    }
    
    
    public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
    
    
    
	public int getRoll() { return roll; }
    public void setRoll(int roll) { this.roll = roll; }

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
