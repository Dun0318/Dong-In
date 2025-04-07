package com.mbc.pdi_05_01.board;

public class BoardDTO {
	int num;
	String title;
	String text;
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDTO(int num, String title, String text) {
		super();
		this.num = num;
		this.title = title;
		this.text = text;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
