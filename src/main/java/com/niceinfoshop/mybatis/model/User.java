package com.niceinfoshop.mybatis.model;

public class User {
	private Long id;
    private String userName;
    private String dt;
    
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", dt=" + dt + "]";
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

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}  
}
