package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeTable")
public class Employee {
	@Id
	//@GeneratedValue(strtegy=GenerationType.Identity)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e;
	private String name;
	private long Salary;
	private String designation;
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
