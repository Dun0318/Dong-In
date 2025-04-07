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
			// �Ѱ� ���� id�� �����ͺ��̽��� �ִ��� üũ�ؿ���
			
			MemberService service = sqlSession.getMapper(MemberService.class);
			int count = service.idcheck(id); //count ���� 0�ƴϸ� 1
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
	public String membersave(MemberDTO dto) { // �ڵ����� ���ε��Ǹ鼭 ���� input ���� �Է� ���� ���� dto�� �� �׷��� dto�� ���� ������ ��� �� �� ����
		
		String id = dto.getId();
		String pw = dto.getPassword();
		String name = dto.getName();
		int age =dto.getAge();
		PasswordEncoder pe = new BCryptPasswordEncoder();
		pw=pe.encode(pw); // ���ڴ� �Լ� ,, ��ȣȭ ,,��ȣȭ
		MemberService service = sqlSession.getMapper(MemberService.class);
		service.memberinsert(id,pw,name,age);
		
		return "redirect:/";
	}
	@RequestMapping(value = "/memberout")
	
	public String memberout(Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs =request.getSession();
		boolean state=(boolean)hs.getAttribute("loginstate"); //���� true or false 
		
		if(state){
		MemberService service = sqlSession.getMapper(MemberService.class);
		ArrayList<MemberDTO> list = service.memberselect();
		model.addAttribute("list", list);
		return "memberout";
		
		}
		else {
				response.setContentType("text/html;charset=UTF-8"); //�˷�â�� �ѱ��� �����ϴ� �ڵ�.
				PrintWriter printwriter = response.getWriter();
				printwriter.print("<script>alert('�α��� �� �̿밡���մϴ�')</script>");
				printwriter.print("<script>location.href='login'</script>");
				printwriter.close();
			return "redirect:/login";
		}
		
	}
	}


