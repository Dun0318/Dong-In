package com.mbc.pdi_05_01.sang;

import java.sql.Date;
import java.util.ArrayList;

public interface SangService {

	void sanginsert(String cardnumber, String sname, int price, Date day);

	ArrayList<SangDTO> sangselect();

	ArrayList<SangDTO> spnametotalselect();

	ArrayList<SangDTO> daysnametotselect();

}
