package com.example.demo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ログインフォームからメールアドレスとパスワードを受け取る。
 * @author manami
 *
 */
public class UserLoginForm {
	
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email(message = "メールアドレスの形式で入力してください。")
	private String userEmail;
	@NotBlank(message = "パスワードを入力してください。")
	@Size(min = 8, max = 16, message = "パスワードは8文字以上16文字以下で入力してください。")
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
