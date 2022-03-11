package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Book;

@Mapper
public interface BookMapper {
	
	/** 書籍情報の全件取得 */
	public List<Book> findAll();
}
