package com.mbc.pdi_05_01.sang;

import java.sql.Date;

public class SangDTO {
	String cardnumber;	//ī���ȣ
	String sname;	//��ǰ��
	int price;	//���Ű���
	Date day;	//���ų�¥
	int tot ;	//�Ѱ������� �� ����
	public SangDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SangDTO(String cardnumber, String sname, int price, Date day, int tot) {
		super();
		this.cardnumber = cardnumber;
		this.sname = sname;
		this.price = price;
		this.day = day;
		this.tot = tot;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	
}
