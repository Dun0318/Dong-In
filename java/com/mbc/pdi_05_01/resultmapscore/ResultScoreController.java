package com.mbc.pdi_05_01.resultmapscore;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultScoreController {
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping(value = "/scoreinfoinput")
	public String scoreinfoinput() {
		
		return "scoreinfoinput";
	}
	
	@RequestMapping(value = "/scoreinfosave")
	public String scoreinfosave(ScoreinfoDTO dto) {
		String num = dto.getNum();
		String name = dto.getName();
		String phone=dto.getPhone();
		
		ResultScoreService service = sqlSession.getMapper(ResultScoreService.class);
		service.scoreinfoinsert(num,name,phone);
		
		return "redirect:/main";
	}
	
	@RequestMapping(value = "/scoreinput1")
	public String scoreinput1() {
		
		return "scoreinput1";
	}
	@RequestMapping(value = "/scoresave1")
	public String scoresave1(ResultScoreDTO dto) {
		String num = dto.getNum();
		int kor = dto.getKor();
		int eng = dto.getEng();
		int mat = dto.getMat();
		
		ResultScoreService service = sqlSession.getMapper(ResultScoreService.class);
		service.scoreinsert(num,kor,eng,mat);
		
		return "redirect:/main";
	}
	@RequestMapping(value = "/scoreinfoout")
	public String scoreinfoout(Model model) {
		
		ResultScoreService service = sqlSession.getMapper(ResultScoreService.class);
		ArrayList<ScoreinfoDTO> list = service.out();
		model.addAttribute("list", list);
		return "scoreinfoout";
	}
	
}
