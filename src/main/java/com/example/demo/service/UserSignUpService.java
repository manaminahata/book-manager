package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserMapper;

@Service
public class UserSignUpService {
	
	@Autowired
	private UserMapper userMapper;
	
	
	/**
	 * 登録済みのメールアドレスかチェックする
	 * @param email
	 * @return
	 */
	public User findByEmail(String email) {
		return userMapper.findByEmail(email);
	}
	
	/**
	 * ユーザーを登録する
	 * @param user
	 */
	public void userInsert(User user) {
		userMapper.insertUser(user);
	}
}
