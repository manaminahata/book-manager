package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserLoginForm;
import com.example.demo.service.UserLoginService;

/**
 * ユーザー登録、ログイン・ログアウト処理を行う
 * @author manami
 *
 */
@Controller
@RequestMapping("/yonda")
public class UserLoginController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private UserLoginService userLoginService;
	
	@ModelAttribute
	public UserLoginForm UserLoginSetUpForm() {
		return new UserLoginForm();
	}
	
	/**
	 * アクセス時のデフォルトの画面を表示する
	 * @return ログイン画面を表示する。
	 */
	@RequestMapping("/login")
	public String index() {
		return "login";
	}
	
	/////////////////////////////////////
	//            ユーザー登録           //
	/////////////////////////////////////

	
	/////////////////////////////////////
	//             ログイン              //
	/////////////////////////////////////
	/**
	 * ユーザーログイン処理を行うメソッド
	 * @param userLoginForm
	 * @return YONDA?のホーム画面
	 */
	@RequestMapping("/login-result")
	public String loginUser(UserLoginForm form, Model model) {
		
		User user = userLoginService.loginUser(form.getUserEmail(), form.getUserPassword());
		
		if (user == null) {
			model.addAttribute("errorMessage","⚠︎メールアドレスまたはパスワードが不正です。");
			return index();
		}
		
		BeanUtils.copyProperties(form, user);
		session.setAttribute("user", user);
		
		if (session.getAttribute("user") != null) {
			System.out.println("check:" + session.getAttribute("user"));
			return "redirect:/yonda/home";
		}
		
		return "redirect:/yonda/login";
	}
	
	/////////////////////////////////////
	//             ログアウト            //
	/////////////////////////////////////
	/**
	 * セッションの有効期限が来る前のタイミングでログアウトする
	 * @return ログイン画面に遷移する
	 */
	@RequestMapping("/logout")
	public String logoutUser() {
		session.invalidate();
		System.out.println("セッション切れ：" + session.getAttribute("user"));
		return "redirect:/yonda/login";
	}
}
