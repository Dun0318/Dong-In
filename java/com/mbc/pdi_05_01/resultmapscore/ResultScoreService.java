package com.mbc.pdi_05_01.resultmapscore;

import java.util.ArrayList;

public interface ResultScoreService {

	void scoreinfoinsert(String num, String name, String phone);

	void scoreinsert(String num, int kor, int eng, int mat);

	ArrayList<ScoreinfoDTO> out();

}
