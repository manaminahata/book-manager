package com.example.demo.domain;

import java.util.List;

public class Book {
	
	private Integer bookId;
	private String bookName;
	private Integer bookCategory;
	private Integer bookPrice;
	private Integer bookPage;
	private Integer bookCurrentPage;
	private List<Thoughts>  bookThoughts;
	private String bookImage;
	private Boolean deleted;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(Integer bookCategory) {
		this.bookCategory = bookCategory;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Integer getBookPage() {
		return bookPage;
	}
	public void setBookPage(Integer bookPage) {
		this.bookPage = bookPage;
	}
	public Integer getBookCurrentPage() {
		return bookCurrentPage;
	}
	public void setBookCurrentPage(Integer bookCurrentPage) {
		this.bookCurrentPage = bookCurrentPage;
	}
	public List<Thoughts> getBookThoughts() {
		return bookThoughts;
	}
	public void setBookThoughts(List<Thoughts> bookThoughts) {
		this.bookThoughts = bookThoughts;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCategory=" + bookCategory + ", bookPrice="
				+ bookPrice + ", bookPage=" + bookPage + ", bookCurrentPage=" + bookCurrentPage + ", bookThoughts="
				+ bookThoughts + ", bookImage=" + bookImage + ", deleted=" + deleted + "]";
	}
}
