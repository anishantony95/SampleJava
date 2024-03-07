package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	@Query(value = "select * from employee_table where salary>=? and salary<=?",nativeQuery = true)
	public List<Employee> getBySalary( int sal1,int sal2);
	
	@Query(value = "select * from employee_table where name=?",nativeQuery=true)
	public List<Employee> getName(String name);
	
	@Query(value = "select * from employee_table where name like ?% and  name like %?",nativeQuery=true)
	public List<Employee> getNameWithChar(char a,char b);
	
	@Query(value = "select max(salary) from employee_table",nativeQuery=true)
	public Integer getMaxSalary();
	@Query(value = "select count(name) from employee_table",nativeQuery=true)
	public Integer getCountName();
	
	}


