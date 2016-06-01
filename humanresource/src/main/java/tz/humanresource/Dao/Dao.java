package tz.humanresource.Dao;

import java.util.List;

import tz.humanresource.model.Employee;

public interface Dao {
	
	
	List<Employee> findAllEmployees();
	
	Employee findById(int id);
	 
    void saveEmployee(Employee employee);
     
    void deleteRow(int id);
    void updateRow(Employee employee);
     
    

}
