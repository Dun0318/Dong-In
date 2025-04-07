package com.mbc.pdi_05_01.book;

public class BookDTO {
	int booknumber;
	String bookname;
	String writer;
	String memo;
	int price;
	String image;
	int count;
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDTO(int booknumber, String bookname, String writer, String memo, int price, String image, int count) {
		super();
		this.booknumber = booknumber;
		this.bookname = bookname;
		this.writer = writer;
		this.memo = memo;
		this.price = price;
		this.image = image;
		this.count = count;
	}
	public int getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
