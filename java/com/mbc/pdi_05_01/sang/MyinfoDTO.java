package com.mbc.pdi_05_01.sang;

public class MyinfoDTO {
	String cardnumber; //카드번호
	String name;	//이름
	String phone;	//전화번호
	SangDTO sdto; //이 객체를 통해서 SangDTO의 정보를 가져올 수 있음 //2개의 클래스를 연결하는 역활을 할 것 //GET SET생성자 만들어줘야함
	int tot ;
	public MyinfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyinfoDTO(String cardnumber, String name, String phone, SangDTO sdto, int tot) {
		super();
		this.cardnumber = cardnumber;
		this.name = name;
		this.phone = phone;
		this.sdto = sdto;
		this.tot = tot;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public SangDTO getSdto() {
		return sdto;
	}
	public void setSdto(SangDTO sdto) {
		this.sdto = sdto;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	
}
