package com.mbc.pdi_05_01.score;

public class ScoreDTO {
	int ban;
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double aver;
	String rank;
	String banrank;
	String allrank;
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getBanrank() {
		return banrank;
	}
	public void setBanrank(String banrank) {
		this.banrank = banrank;
	}
	public String getAllrank() {
		return allrank;
	}
	public void setAllrank(String allrank) {
		this.allrank = allrank;
	}
	public ScoreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScoreDTO(int ban, int num, String name, int kor, int eng, int mat, int tot, double aver, String rank,
			String banrank, String allrank) {
		super();
		this.ban = ban;
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.aver = aver;
		this.rank = rank;
		this.banrank = banrank;
		this.allrank = allrank;
	}
	
}
