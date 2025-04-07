package com.mbc.pdi_05_01.company;

import java.sql.Date;
import java.util.ArrayList;

import com.mbc.pdi_05_01.book.BookDTO;

public interface CompanyService {

	void companyinsert(String name, String jumin, Date day, String family, String rank);

	ArrayList<CompanyDTO> companyselect();

	CompanyDTO updateselect(int snumber);

	void companyupdatego(String name, String jumin, Date day, String family, String rank, int snumber);

	void deletego(int snumber);

	ArrayList<BookDTO> companysearchgo(String data, String result);

}
