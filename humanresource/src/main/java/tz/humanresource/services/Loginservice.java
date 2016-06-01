package tz.humanresource.services;

import tz.humanresource.model.User;

public interface Loginservice {
	
	
	
	public User loadUserByUsername(String username);
	
  }


