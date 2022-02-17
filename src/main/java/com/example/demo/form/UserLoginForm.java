package com.example.demo.form;

/**
 * ログインフォームからメールアドレスとパスワードを受け取る。
 * @author manami
 *
 */
public class UserLoginForm {
	
	private String userEmail;
	private String userPassword;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	@Override
	public String toString() {
		return "UserLoginForm [userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}
}
