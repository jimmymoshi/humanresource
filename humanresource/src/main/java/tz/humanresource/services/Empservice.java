package tz.humanresource.services;

import java.util.List;  

import tz.humanresource.model.Employee;  
  

public interface Empservice {
	  
List<Employee> findAllEmployees();
	
	Employee findById(int id);
	 
    public void saveEmployee(Employee employee);
     
    public void deleteRow(int id);
    public void updateRow(Employee employee); 
	  
	}  


