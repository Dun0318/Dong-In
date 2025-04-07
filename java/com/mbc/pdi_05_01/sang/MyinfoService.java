package com.mbc.pdi_05_01.sang;

import java.sql.Date;
import java.util.ArrayList;

public interface MyinfoService {

	

	void myinfoinsert(String cardnumber, String name, String phone);

	ArrayList<MyinfoDTO> myinfoselect();

	ArrayList<MyinfoDTO> mytot();



}
