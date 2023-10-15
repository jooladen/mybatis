package com.niceinfoshop.mybatis.model;

public class User {
	private Long id;
    private String userName;

    @Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
}
