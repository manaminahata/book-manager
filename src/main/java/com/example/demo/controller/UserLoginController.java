package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserLoginForm;
import com.example.demo.service.UserLoginService;

@Controller
@RequestMapping("/")
public class UserLoginController {

//	@Autowired
//	private HttpSession session;
	
	@Autowired
	private UserLoginService userLoginService;
	
	@ModelAttribute
	public UserLoginForm UserLoginSetUpForm() {
		return new UserLoginForm();
	}
	
	@RequestMapping("/yonda")
	public String index() {
		return "login";
	}
	
	/**
	 * ユーザーログイン処理を行うメソッド
	 * @param userLoginForm
	 * @return YONDA?のホーム画面
	 */
	@RequestMapping("/login")
	public String loginUser(UserLoginForm form, Model model) {
		
		User user = userLoginService.loginUser(form.getUserEmail(), form.getUserPassword());
		
		if (user == null) {
			model.addAttribute("errorMessage","⚠︎メールアドレスまたはパスワードが不正です。");
			return "login";
		}
		return "home";
	}
}
