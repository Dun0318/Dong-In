package com.mbc.pdi_05_01.sang;

public class MyinfoDTO {
	String cardnumber; //ī���ȣ
	String name;	//�̸�
	String phone;	//��ȭ��ȣ
	SangDTO sdto; //�� ��ü�� ���ؼ� SangDTO�� ������ ������ �� ���� //2���� Ŭ������ �����ϴ� ��Ȱ�� �� �� //GET SET������ ����������
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
