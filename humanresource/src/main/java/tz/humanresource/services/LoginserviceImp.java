package tz.humanresource.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import tz.humanresource.Dao.LoginImp;
import tz.humanresource.model.User;


public class LoginserviceImp implements Loginservice {
	
	@Autowired
	 private LoginImp loginDao;
    

     
     

	@Override
	public User loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		  
		 return loginDao.findByUsername(username);
	}

	

}
