package com.mbc.pdi_05_01.score;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScoreController {
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("/scoreinput")
	public String scoreinput(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		
		if(login) {
			return "scoreinput";
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter printwriter = response.getWriter();
			printwriter.print("<script>alert('로그인 후 이용가능합니다.')</script>");
			printwriter.print("<script>location.href='login'</script>");
			printwriter.close();
		return "redirect:/login";
			
		}
		
	}
	@RequestMapping("/scoresave")
	public String scoresave(ScoreDTO dto) {
		int ban = dto.getBan();
		int num = dto.getNum();
		String name = dto.getName();
		int kor=dto.getKor();
		int eng = dto.getEng();
		int mat = dto.getMat();
		ScoreService service = sqlSession.getMapper(ScoreService.class);
		service.scoreinsert(ban,num,name,kor,eng,mat);
		return "redirect:/main";
	}
	@RequestMapping("/scoreout")
	public String scoreout(Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		
		if(login) {
			ScoreService service = sqlSession.getMapper(ScoreService.class);
			ArrayList<ScoreDTO> list = service.scoreselect();
			model.addAttribute("list", list);
			return "scoreout";
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter printWriter= response.getWriter();
			printWriter.print("<script>alert('회원만 열람할 수 있습니다.')</script>");
			printWriter.print("<script>location.href='login'</script>");
			printWriter.close();
		return "redirect:/login";
		}
	}
	
}
