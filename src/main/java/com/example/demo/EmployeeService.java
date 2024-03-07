package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;
	public List<Employee> get(){
		return ed.get1();
	}
	
	public String putemployee(Employee e){
		return ed.putemployee(e);
	}
	
	public String putemployeeSaveAll(@RequestBody List<Employee> e) {
		return ed.putemployeeSaveAll(e);
		
	}
	public Optional<Employee> findById(int i){
		 return ed.findById(i);
			
	}
	
	public List<Employee> FindAll() {
		return ed.FindAll();
	}
	
	public String DeleteById(int i) {
		
		return ed.DeleteById(i);
	}
	
	public String DeleteAll() {
		return ed.DeleteAll();
	}
	public String UpdateService(int a,Employee e) {
		return ed.Update(a, e);
	}
	public List<Employee> getBySalary(int sal1,int sal2){
		return ed.getBySalary(sal1,sal2);
	}
	public List<Employee> getName( String name){
		return ed.getName(name);
	}
	public List<Employee> getNameWithChar(char a, char b){
		return ed.getNameWithChar(a,b);
	}
	public Integer getMaxSalary() {
		return ed.getMaxSalary();
	}
	public Integer getCountName() {
		return ed.getCountName();
	}
}
