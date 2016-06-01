package tz.humanresource.Dao;

import tz.humanresource.model.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DaoImp implements Dao {
	
	
     @Autowired
	private SessionFactory sessionFactory;  
	  
	 @Override  
	 @Transactional  
	 public void saveEmployee(Employee employee) {  
	  Session session = sessionFactory.openSession();  
	  Transaction tx = session.beginTransaction();  
	  session.saveOrUpdate(employee);  
	  tx.commit(); 
	  session.close();  
	   
	 }  
	  
	  @Override
	 public List<Employee> findAllEmployees() 
	  {  
	  Session session = sessionFactory.openSession();  
	  @SuppressWarnings("unchecked")  
	 List<Employee> employeeList = session.createQuery("from Employee").list(); 
	
	 session.close();  
	 
	 return employeeList; 
	  
	 }  
	  
	  @Override
	 public Employee findById(int id) {  
	  Session session = sessionFactory.openSession();  
	  Employee employee = (Employee) session.load(Employee.class, id);  
	  return employee;  
	 }  
	  
	 @Override  
	 public void updateRow(Employee employee) {  
	  Session session = sessionFactory.openSession();  
	  Transaction tx = session.beginTransaction();  
	  session.saveOrUpdate(employee);  
	  tx.commit();   
	  session.close();
	 }  
	  
	 @Override  
	 public void deleteRow(int id) {  
	  Session session = sessionFactory.openSession();  
	  Transaction tx = session.beginTransaction();  
	  Employee employee = (Employee) session.load(Employee.class, id);  
	  session.delete(employee);  
	  tx.commit();  
	   
	 }  
	  
	}  

