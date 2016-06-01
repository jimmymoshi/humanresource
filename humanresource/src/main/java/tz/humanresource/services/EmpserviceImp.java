package tz.humanresource.services;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tz.humanresource.Dao.Dao;  
import tz.humanresource.model.Employee;  



public class EmpserviceImp implements Empservice {
	
	   
	 @Autowired  
	 Dao Dao;  
	  
	 @Override  
	 public void saveEmployee(Employee employee) {  
	       Dao.saveEmployee(employee);  
	 }  
	  
	 @Override  
	 public List<Employee> findAllEmployees() {  
	       return Dao.findAllEmployees();  
	 }  
	  
	 @Override  
	 public Employee findById(int id) {  
	  return Dao.findById(id);  
	 }  
	  
	 @Override  
	 public void updateRow(Employee employee) {  
	   Dao.updateRow(employee);  
	 }  
	  
	 @Override  
	 public void deleteRow(int id) {  
	       Dao.deleteRow(id);  
	 }  
	  
	}  


