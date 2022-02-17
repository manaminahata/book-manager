package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserMapper;

@Service
public class UserLoginService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * ログイン用のメソッド
	 * メールアドレスとパスワードがDBに登録されているデータと一致する場合のみログイン可能
	 * @param email
	 * @param password
	 * @return メールアドレスとパスワードが一致したユーザーデータ
	 */
	public User loginUser(String email, String password) {
		
		System.out.println(email);
		System.out.println(password);
		
		User user = userMapper.findByUser(email, password);
		System.out.println(user);
		
		return user;
		
//		List<User> userList = userMapper.findAll();
//		List<User> user = new ArrayList<>();
//		
//		// メールアドレスまたはパスワードが空欄の場合
//		if (email.isEmpty() || password.isEmpty()) {
//			System.out.println("メールアドレスまたはパスワードが空欄です。");
//			return user;
//		} 
//		
//		// 全件処理したユーザーの中から一致するユーザーがいるか確認する処理
//		if (!(email.isEmpty() || password.isEmpty())) {
//			user = userList.stream()
//				.filter(u -> u.getUserEmail().equals(email) && u.getUserPassword().equals(password))
//				.collect(Collectors.toList());
//			System.out.println(user);
//		}
//		
//		// 一致するユーザーがいなかった場合の処理
//		if (user.isEmpty()) {
//			System.out.println("該当のユーザーがいません。");
//			return user;
//		}
//		
//		return user;
	}
}
