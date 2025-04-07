package com.mbc.pdi_05_01.sang;

import java.sql.Date;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SangController {
	@Autowired
	SqlSession sqlSession ;
	@RequestMapping(value = "/sanginput")
	public String sanginput() {
		
		return "sanginput";
	}
	@RequestMapping(value = "/sangsave",method=RequestMethod.POST )
	public String sangsave(SangDTO dto) {
		
		String cardnumber=dto.getCardnumber();
		String sname=dto.getSname();
		int price=dto.getPrice();
		Date day = dto.getDay();
		SangService service = sqlSession.getMapper(SangService.class);
		service.sanginsert(cardnumber,sname,price,day);
		return "redirect:/main";
		
	}
	@RequestMapping(value = "/sangout")
	public String sangout(Model model) {
		SangService service=sqlSession.getMapper(SangService.class);
		ArrayList<SangDTO> list = service.sangselect();
		model.addAttribute("list", list);
		
		return "sangout";
	}
	@RequestMapping(value = "/snametotal")
	public String snametotal(Model model) {
		SangService service=sqlSession.getMapper(SangService.class);
		ArrayList<SangDTO> list = service.spnametotalselect();
		model.addAttribute("list", list);
		
		return "snametotal";
	}
	
	@RequestMapping(value = "/daysnametot")
	public String daysnametot(Model model) {
		SangService service=sqlSession.getMapper(SangService.class);
		ArrayList<SangDTO> list = service.daysnametotselect();
		model.addAttribute("list", list);
		
		return "daysnametot";
	}
}
