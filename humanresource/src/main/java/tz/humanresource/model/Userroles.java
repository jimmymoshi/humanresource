package tz.humanresource.model;

public class Userroles {
	
	private Integer userroleid;
	private User user;
	private String role;
	
	
	public Userroles() {
	}

	public Userroles(User user, String role) {
		this.user = user;
		this.role = role;
	}
	
	public Integer getUserroleid() {
		return userroleid;
	}
	public void setUserroleid(Integer userroleid) {
		this.userroleid = userroleid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	
	

}
