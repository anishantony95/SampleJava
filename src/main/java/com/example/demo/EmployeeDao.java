package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo er;
	public List<Employee> get1(){
		return er.findAll();
}
	public String putemployee( Employee e) {
		 er.save(e);
		 return "Success";
	}
	public String putemployeeSaveAll( List<Employee> e) {
		 er.saveAll(e);
		 return "Success";
	}
	public Optional<Employee> findById(int i){
		 return er.findById(i);
		
	}
	@GetMapping("/FindAll")
	public List<Employee> FindAll() {
		return er.findAll();
	}
	@DeleteMapping("/DeleteById")
	public String DeleteById(int i) {
		er.deleteById(i);
		return "dELETED";
	}
	@DeleteMapping("/deleteAll")
	public String DeleteAll() {
		er.deleteAll();
		return "Delleted All";
	}
	//@PutMapping("/Update/{i}")
	public String Update( int i,Employee e) {
		Employee s= er.findById(i).get();
		s.setName(e.getName());
		//s.setDesignation(e.getDesignation());
		//s.setSalary(e.getSalary());
		er.save(s);
		return "Updated";
	}
	public List<Employee> getBySalary(int sal1,int sal2){
		return er.getBySalary(sal1, sal2);
	}
	public List<Employee> getName( String name){
		return er.getName(name);
	}
	public List<Employee> getNameWithChar(char a,char b){
		return er.getNameWithChar(a,b);
	}
	public Integer getMaxSalary() {
		return er.getMaxSalary();
	}
	public Integer getCountName() {
		return er.getCountName();
	}
}
