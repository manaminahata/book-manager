package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.User;

/**
 * ユーザー情報とDBを繋ぐMapperインターフェイス
 * ユーザー登録／登録情報の修正／登録の削除／ログイン
 * @author manami
 *
 */
@Mapper
public interface UserMapper {
	
	/** ユーザー情報の全件取得 */
	public List<User> findAll();
	
	/** idが一致するユーザーの取得 */
	public User findByOne(@Param("id") int id);
	
	/** メールアドレスとパスワードが一致するユーザー情報の取得 */
	public User findByUser(@Param("email") String email, @Param("password") String password);
	
	/** ユーザー情報の登録 */
	public void insert(User user);
	
	/** ユーザー情報の変更 */
	public void update(User user);
}
