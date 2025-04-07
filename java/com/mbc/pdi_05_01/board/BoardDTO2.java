package com.mbc.pdi_05_01.board;

public class BoardDTO2 {
	int boardnumber;
	String title;
	String writer;
	String text;
	String day;
	int count;
	int groups;
	int temp;
	int indent;
	public BoardDTO2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDTO2(int boardnumber, String title, String writer, String text, String day, int count, int groups,
			int temp, int indent) {
		super();
		this.boardnumber = boardnumber;
		this.title = title;
		this.writer = writer;
		this.text = text;
		this.day = day;
		this.count = count;
		this.groups = groups;
		this.temp = temp;
		this.indent = indent;
	}
	public int getBoardnumber() {
		return boardnumber;
	}
	public void setBoardnumber(int boardnumber) {
		this.boardnumber = boardnumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getGroups() {
		return groups;
	}
	public void setGroups(int groups) {
		this.groups = groups;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getIndent() {
		return indent;
	}
	public void setIndent(int indent) {
		this.indent = indent;
	}
	
	
	
}
