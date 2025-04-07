package com.mbc.pdi_05_01.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	@Autowired
	SqlSession sqlSession;
	@RequestMapping(value = "/memberinput")
	public String memberinput() {
		return "memberinput";
	}
	
	@ResponseBody
	@RequestMapping(value = "/idcheck")
		public String idcheck(String id) {
			// 넘겨 받은 id가 데이터베이스에 있는지 체크해여함
			
			MemberService service = sqlSession.getMapper(MemberService.class);
			int count = service.idcheck(id); //count 값은 0아니면 1
			String bigo;
			if(count==1) {
				bigo="no";
			}
			else {
				bigo="ok";
			}
			return bigo;
		}
	
	@RequestMapping(value="/membersave")
	public String membersave(MemberDTO dto) { // 자동으로 바인딩되면서 값이 input 에서 입력 받은 값이 dto로 들어감 그래서 dto로 값을 가져와 사용 할 수 있음
		
		String id = dto.getId();
		String pw = dto.getPassword();
		String name = dto.getName();
		int age =dto.getAge();
		PasswordEncoder pe = new BCryptPasswordEncoder();
		pw=pe.encode(pw); // 엔코더 함수 ,, 부호화 ,,암호화
		MemberService service = sqlSession.getMapper(MemberService.class);
		service.memberinsert(id,pw,name,age);
		
		return "redirect:/";
	}
	@RequestMapping(value = "/memberout")
	
	public String memberout(Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs =request.getSession();
		boolean state=(boolean)hs.getAttribute("loginstate"); //값은 true or false 
		
		if(state){
		MemberService service = sqlSession.getMapper(MemberService.class);
		ArrayList<MemberDTO> list = service.memberselect();
		model.addAttribute("list", list);
		return "memberout";
		
		}
		else {
				response.setContentType("text/html;charset=UTF-8"); //알럿창을 한글을 지원하는 코드.
				PrintWriter printwriter = response.getWriter();
				printwriter.print("<script>alert('로그인 후 이용가능합니다')</script>");
				printwriter.print("<script>location.href='login'</script>");
				printwriter.close();
			return "redirect:/login";
		}
		
	}
	}


