package com.example.demo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserSignUpForm {
	
	@NotBlank(message = "ユーザーネームを入力してください")
	private String userName;
	
	@NotBlank(message = "メールアドレスを入力してください")
	@Email(message = "メールアドレスの形式が不正です")
	private String userEmail;
	
	@NotBlank(message = "パスワードを入力してください")
	@Size(min = 8, max = 16, message = "8~16文字で入力してください")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "半角英数字で入力してください")
	private String userPassword;
	
	@NotBlank(message = "確認用パスワードを入力してください")
	private String userConfirmPassword;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
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
	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}
	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}
	
	@Override
	public String toString() {
		return "UserSignUpForm [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userConfirmPassword=" + userConfirmPassword + "]";
	}
	
	
}
