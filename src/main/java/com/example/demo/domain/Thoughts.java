package com.example.demo.domain;

public class Thoughts {
	
	private Integer thoughtId;
	private String thoughtText;
	private Integer thoughtBookId;
	private Boolean deleted;
	
	public Integer getThoughtId() {
		return thoughtId;
	}
	public void setThoughtId(Integer thoughtId) {
		this.thoughtId = thoughtId;
	}
	public String getThoughtText() {
		return thoughtText;
	}
	public void setThoughtText(String thoughtText) {
		this.thoughtText = thoughtText;
	}
	public Integer getThoughtBookId() {
		return thoughtBookId;
	}
	public void setThoughtBookId(Integer thoughtBookId) {
		this.thoughtBookId = thoughtBookId;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
	@Override
	public String toString() {
		return "Thoughts [thoughtId=" + thoughtId + ", thoughtText=" + thoughtText + ", thoughtBookId=" + thoughtBookId
				+ ", deleted=" + deleted + "]";
	}
	
}
