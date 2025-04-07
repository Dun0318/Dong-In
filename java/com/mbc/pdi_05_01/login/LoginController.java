package com.mbc.pdi_05_01.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	@RequestMapping(value = "/loginsave")
	public String loginsave(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String id=request.getParameter("id");
		String pw=request.getParameter("password");
		
		// id�� id �� ���� password�� �����ͺ��̽����� ������ �;���
		LoginService service = sqlSession.getMapper(LoginService.class);
		String cpw = service.loginselect(id); // ��ȣȭ �Ǿ��ִ� Password�� ������.
		PasswordEncoder pe = new BCryptPasswordEncoder();
		boolean flag=pe.matches(pw, cpw);
		//System.out.println(flag+" �α��� ���");
		
		if(flag) {
			HttpSession hs = request.getSession();
			hs.setAttribute("loginstate",true);
			hs.setAttribute("id", id);
			
			
			return "redirect:/main";
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter print = response.getWriter();
			print.print("<script>alert('ID �Ǵ� Password�� �߸� �ԷµǾ����.')</script>");
			print.print("<script>location.href='login'</script>");
			print.close();
			return "redirect:/login";
		}
		
	
		
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request) {
		HttpSession hs = request.getSession(); //�ݵ�� request ��ü�� �־�� ��밡��
		hs.removeAttribute("loginstate");
		hs.removeAttribute("id");
		return "redirect:/";
	}
}
