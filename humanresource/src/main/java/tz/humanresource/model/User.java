package tz.humanresource.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User {
	
	
	/*
	
	 */
	private Integer id;
	private String username;
	private String password;
	private boolean enabled;
	
	private Set<Userroles> userroles = new HashSet<Userroles>(0);
	
	
	
	public User() {
	}

	public User(String username, String password, boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public User(String username, String password, 
		boolean enabled, Set<Userroles> userroles) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.userroles = userroles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Userroles> getUserroles() {
		return userroles;
	}

	public void setUserroles(Set<Userroles> userroles) {
		this.userroles = userroles;
	}

	
	
	
	
	
    
	
	}
  
	
	
	
	
	
	
	

