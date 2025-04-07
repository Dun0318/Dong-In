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
public class MyinfoController {
	@Autowired
	SqlSession sqlSession ;
	@RequestMapping(value = "/myinfoinput")
	public String myinfoinput() {
		
		return "myinfoinput";
	}
	@RequestMapping(value = "/myinfosave",method=RequestMethod.POST )
	public String myinfosave(MyinfoDTO dto) {
		String cardnumber=dto.getCardnumber();
		String name=dto.getName();
		String phone=dto.getPhone();
		MyinfoService service = sqlSession.getMapper(MyinfoService.class);
		service.myinfoinsert(cardnumber,name,phone);
		return "redirect:/main";
		
	}
	@RequestMapping(value = "/myinfoout")
	public String myinfoout(Model model) {
		MyinfoService service = sqlSession.getMapper(MyinfoService.class);
		ArrayList<MyinfoDTO> list = service.myinfoselect();
		model.addAttribute("list", list);
		return "myinfoout";
	}
	@RequestMapping(value="/mytot")
	public String Mytot(Model model) {
		MyinfoService service = sqlSession.getMapper(MyinfoService.class);
		ArrayList<MyinfoDTO> list = service.mytot(); //MyinfoDTO 안에 sdto 즉 SangDTO가있음
		model.addAttribute("list", list);
		return "mytotout";
	}
}
