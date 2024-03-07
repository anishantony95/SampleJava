package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@GetMapping("/getAll ")
	public List<Employee> get(){
		return es.get();
		
	} 
	@PostMapping("/putemployee")
	public String putemployee(@RequestBody Employee e){
		return es.putemployee(e);
	}
	@PostMapping("/putemployeeSaveAll")
	public String putemployeeSaveAll(@RequestBody List<Employee> e) {
		return es.putemployeeSaveAll(e);
		
	}
	@GetMapping("/findById/{i}")
	public Optional<Employee> findById(@PathVariable int i){
		 return es.findById(i);
			
	}
	@GetMapping("/FindAll")
	public List<Employee> FindAll() {
		return es.FindAll();
	}
	@DeleteMapping("/DeleteById/{i}")
	public String DeleteById(@PathVariable int i) {
		es.DeleteById(i);
		return "dELETED";
	}
	@DeleteMapping("/deleteAll")
	public String DeleteAll() {
		return es.DeleteAll();
	}
	
	@PostMapping("/Update/{i}")
	public String Update(@PathVariable int i,@RequestBody Employee e) {
		return es.UpdateService(i, e);
	}
	@GetMapping("/SalaryRange/{sal1}/{sal2}")
	public List<Employee> getBySalary(@PathVariable int sal1,@PathVariable int sal2){
		return es.getBySalary(sal1,sal2);
	}
	@GetMapping("/SalaryRange/{name}")
	public List<Employee> getName(@PathVariable String name){
		return es.getName(name);
	}
	@GetMapping("/SalaryRangeWithChar/{a}/{b}")
	public List<Employee> getNameWithChar(@PathVariable char a,@PathVariable char b ){
		return es.getNameWithChar(a,b);
	}
	@GetMapping("/getMaxSalary")
	public Integer getMaxSalary() {
		return es.getMaxSalary();
	}
	@GetMapping("/getCountName")
	public Integer getCountName() {
		return es.getCountName();
	}
			

	
	

}
