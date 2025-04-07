package com.mbc.pdi_05_01.resultmapscore;

public class ResultScoreDTO {
	String num ;
	int kor,eng,mat;
	public ResultScoreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultScoreDTO(String num, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
}
