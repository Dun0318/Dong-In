package com.mbc.pdi_05_01.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mbc.pdi_05_01.book.BookDTO;
import com.mbc.pdi_05_01.book.BookService;

@Controller
public class CompanyController {
	@Autowired
	SqlSession sqlSession;
	@RequestMapping(value = "/companyinput")
	public String companyinput(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		
		if(login) {
			return "companyinput";
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
	@RequestMapping(value = "/companysave",method = RequestMethod.POST)
	public String companysave(CompanyDTO dto) {
		String name =dto.getName();
		String jumin=dto.getJumin();
		Date day =dto.getDay();
		String family=dto.getFamily();
		String rank=dto.getRank();
		CompanyService service = sqlSession.getMapper(CompanyService.class);
		service.companyinsert(name,jumin,day,family,rank);
		
		
		return "redirect:/main";
		
	}
	@RequestMapping(value = "/companyout")
	public String companyout(Model model,HttpServletRequest request , HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		
		if(login) {
			CompanyService service = sqlSession.getMapper(CompanyService.class);
			ArrayList<CompanyDTO> list = service.companyselect();
			model.addAttribute("list", list);
			
			return "companyout";
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
	@RequestMapping(value = "/companyupdate")
	public String update(Model model,HttpServletRequest request) {
		int snumber=Integer.parseInt(request.getParameter("snumber"));
		CompanyService service = sqlSession.getMapper(CompanyService.class);
		CompanyDTO dto = service.updateselect(snumber);
		model.addAttribute("dto", dto);
		
		return "companyupdateview";
		
	}
	@RequestMapping(value = "/companyupdatego")
	public String companyupdatego(HttpServletRequest request) {
		int snumber=Integer.parseInt(request.getParameter("snumber"));
		String name = request.getParameter("name");
		String jumin = request.getParameter("jumin");
		Date day=Date.valueOf(request.getParameter("day"));
		String family=request.getParameter("family");
		String rank = request.getParameter("rank");
		
		CompanyService service = sqlSession.getMapper(CompanyService.class);
		service.companyupdatego(name,jumin,day,family,rank,snumber);
		
		
		return "redirect:/companyout";
		
	}
	@RequestMapping(value = "/companydelete")
	public String companydelete(Model model,HttpServletRequest request) {
		int snumber=Integer.parseInt(request.getParameter("snumber"));
		CompanyService service = sqlSession.getMapper(CompanyService.class);
		CompanyDTO dto = service.updateselect(snumber);
		model.addAttribute("dto", dto);
		
		return "companydeleteview";
	}
	@RequestMapping(value = "/companydeletego")
	public String companydeletego(HttpServletRequest request) {
		int snumber=Integer.parseInt(request.getParameter("snumber"));
		CompanyService service = sqlSession.getMapper(CompanyService.class);
		service.deletego(snumber);
		
		
		return "redirect:/companyout";
	}
	
	@RequestMapping(value = "/companysearch")
	public String companysearch(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		
		if(login) {
			
			
			return "companysearch";
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
	@RequestMapping(value = "/companysearchgo")
	public String companysearchgo(HttpServletRequest request,Model model) {
		
		String data = request.getParameter("data");
		String result = request.getParameter("result");
		CompanyService service = sqlSession.getMapper(CompanyService.class);
		ArrayList<BookDTO> list = service.companysearchgo(data,result);
		 if (list == null) {
		        System.out.println("검색 결과가 없습니다.");
		    }
		    
		model.addAttribute("list", list);
		return "companysearchview";
	}
	
}
