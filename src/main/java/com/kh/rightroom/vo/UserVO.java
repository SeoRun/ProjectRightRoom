package com.kh.rightroom.vo;

public class UserVO {
	private int user_no;
	private String user_id;
	private	String user_pw;
	private String user_name;
	private String user_phone;
	private String user_email;
	private int user_rank;
	
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
	public int getUser_rank() {
		return user_rank;
	}
	public void setUser_rank(int user_rank) {
		this.user_rank = user_rank;
	}
	
	@Override
	public String toString() {
		  return "UserVO [user_no=" + user_no + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name="
		    + user_name + ", user_phone=" + user_phone + ", user_email=" + user_email + ", user_rank=" + user_rank + "]";
		 }
}
