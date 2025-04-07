package com.mbc.pdi_05_01.company;

import java.sql.Date;

public class CompanyDTO {
	
	int snumber;	//사원번호
	String name;	//사원명
	String jumin;	//주민번호
	Date day;	//입사날짜
	String family;	//가족수
	String rank; //직위
	String sexuality;
	int inday,kibonsudang,familysudang,ranksudang,totalSalary,age; //근무기간 ,기본수당 , 가족수당 , 직위수당 , 총급여 ,나이
	public CompanyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyDTO(int snumber, String name, String jumin, Date day, String family, String rank, String sexuality,
			int inday, int kibonsudang, int familysudang, int ranksudang, int totalSalary, int age) {
		super();
		this.snumber = snumber;
		this.name = name;
		this.jumin = jumin;
		this.day = day;
		this.family = family;
		this.rank = rank;
		this.sexuality = sexuality;
		this.inday = inday;
		this.kibonsudang = kibonsudang;
		this.familysudang = familysudang;
		this.ranksudang = ranksudang;
		this.totalSalary = totalSalary;
		this.age = age;
	}
	public int getSnumber() {
		return snumber;
	}
	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getSexuality() {
		return sexuality;
	}
	public void setSexuality(String sexuality) {
		this.sexuality = sexuality;
	}
	public int getInday() {
		return inday;
	}
	public void setInday(int inday) {
		this.inday = inday;
	}
	public int getKibonsudang() {
		return kibonsudang;
	}
	public void setKibonsudang(int kibonsudang) {
		this.kibonsudang = kibonsudang;
	}
	public int getFamilysudang() {
		return familysudang;
	}
	public void setFamilysudang(int familysudang) {
		this.familysudang = familysudang;
	}
	public int getRanksudang() {
		return ranksudang;
	}
	public void setRanksudang(int ranksudang) {
		this.ranksudang = ranksudang;
	}
	public int getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
