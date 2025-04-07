package com.mbc.pdi_05_01.score;

import java.util.ArrayList;

public interface ScoreService {

	void scoreinsert(int ban, int num, String name, int kor, int eng, int mat);

	ArrayList<ScoreDTO> scoreselect();

}
