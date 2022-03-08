package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.UserSignUpForm;
import com.example.demo.service.UserSignUpService;

@Controller
@RequestMapping("/yonda")
public class UserSignUpController {
	
	@Autowired
	private UserSignUpService userSignUpService;
	
	@ModelAttribute
	public UserSignUpForm userSignUpForm() {
		return new UserSignUpForm();
	}
	
	@RequestMapping("/sign-up")
	public String signUp() {
		return "sign-up";
	}
	
	/////////////////////////////////////
	//            ユーザー登録           //
	/////////////////////////////////////
	@RequestMapping("/sign-up-result")
	public String userRegister(@Validated UserSignUpForm form, BindingResult result, Model model) {
		
		System.out.println(form);
		
		// formで設定した入力値チェック
		if (result.hasErrors()) {
			return "sign-up";
		}
		
		System.out.println("入力値チェック1:" + form);
		
		// 既に使われているメールアドレスかチェック
		if (!(userSignUpService.findByEmail(form.getUserEmail()) == null)) {
			model.addAttribute("errorEmail", "このメールアドレスは既に利用されています");
			return "sign-up";
		}
		
		System.out.println("入力値チェック2:" + form);
		
		// パスワードと確認用パスワードが一致しているかチェック
		if (!form.getUserPassword().equals(form.getUserConfirmPassword())) {
			model.addAttribute("errorCheckPass", "パスワードが一致していません");
			return "sign-up";
		}
		
		System.out.println("入力値チェック3:" + form);
		
		// 問題がなければユーザーを登録する
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		System.out.println(user);
		
		userSignUpService.userInsert(user);

		return "redirect:/yonda/confirm";
	}
	
	/////////////////////////////////////
	//            登録内容確認           //
	/////////////////////////////////////
	@RequestMapping("/confirm")
	public String confirm() {
		return "user-confirm";
	}

}
