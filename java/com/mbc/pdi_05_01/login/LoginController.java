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
		
		// id로 id 가 같은 password를 데이터베이스에서 가지고 와야함
		LoginService service = sqlSession.getMapper(LoginService.class);
		String cpw = service.loginselect(id); // 암호화 되어있는 Password를 가져옴.
		PasswordEncoder pe = new BCryptPasswordEncoder();
		boolean flag=pe.matches(pw, cpw);
		//System.out.println(flag+" 로그인 결과");
		
		if(flag) {
			HttpSession hs = request.getSession();
			hs.setAttribute("loginstate",true);
			hs.setAttribute("id", id);
			
			
			return "redirect:/main";
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter print = response.getWriter();
			print.print("<script>alert('ID 또는 Password가 잘못 입력되었어요.')</script>");
			print.print("<script>location.href='login'</script>");
			print.close();
			return "redirect:/login";
		}
		
	
		
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request) {
		HttpSession hs = request.getSession(); //반드시 request 객체가 있어야 사용가능
		hs.removeAttribute("loginstate");
		hs.removeAttribute("id");
		return "redirect:/";
	}
}
