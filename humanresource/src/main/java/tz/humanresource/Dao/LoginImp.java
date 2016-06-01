package tz.humanresource.Dao;



import java.util.ArrayList;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import tz.humanresource.model.User;


public class LoginImp implements LoginDao {
	
	@Autowired  
	 SessionFactory sessionFactory;  
	
	

	@SuppressWarnings("unchecked")
	@Override
	public User findByUsername(String username) throws UsernameNotFoundException 
	
	    {

		List<User> users = new ArrayList<User>();

		users = sessionFactory.openSession().createQuery("from User where username=?").setParameter(0, username).list();
		if (users == null)
		{ 
			throw new UsernameNotFoundException("User not found" + username);
			}
		
         
		if (users.size() > 0) {
			return users.get(0);
		} 
		else
		{
			return null;
		}
	}



	

}
