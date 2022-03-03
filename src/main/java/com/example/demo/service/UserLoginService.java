package com.example.demo.service;

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
		User user = userMapper.findByUser(email, password);
		return user;
	}
	
	public User authentication(int id) {
		User user = userMapper.findByOne(id);
		return user;
	}
}
