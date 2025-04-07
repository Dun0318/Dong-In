package com.mbc.pdi_05_01.board;

import java.util.ArrayList;

public interface BoardService {

	void announcementinsert(String title, String text);

	ArrayList<BoardDTO> announcementselect();

	BoardDTO announcementtext(int number);

	void boardinsert(String title, String writer, String text);

	ArrayList<BoardDTO2> boardselect();

	BoardDTO2 detailselect(int boardnumber);

	BoardDTO2 replyselect(int boardnumber);

	void countup(int boardnumber);

	void stetup(int groups, int temp);

	void reply(String title, String writer, String text, int groups, int temp, int indent);

}
