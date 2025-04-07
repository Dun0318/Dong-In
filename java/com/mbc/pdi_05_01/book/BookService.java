package com.mbc.pdi_05_01.book;

import java.util.ArrayList;

public interface BookService {

	void bookinsert(String bookname, String writer, String memo, int price, String image);

	ArrayList<BookDTO> bookselect();

	void countup(int booknumber);

	BookDTO countupview(int booknumber);

	BookDTO bookupdateselect(int booknumber);

	void bookupdatego(String bookname, String writer, String memo, int price, String image, int booknumber);

	void bookupdatego2(String bookname, String writer, String memo, int price, int booknumber);

	BookDTO bookdeleteselect(int booknumber);

	void bookdeletego(int booknumber);

	ArrayList<BookDTO> booksearchgo(String data, String result);



}
