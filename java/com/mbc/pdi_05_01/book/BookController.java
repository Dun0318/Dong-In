package com.mbc.pdi_05_01.book;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class BookController {
	@Autowired
	SqlSession sqlsession;
	String path = "C:\\MBC12AI\\spring\\DAY_05_01\\src\\main\\webapp\\image";
	@RequestMapping(value = "/bookinput")
	public String bookinput(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		if(login) {
		return "bookinput";
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
	@RequestMapping(value = "/booksave")
	public String booksave(MultipartHttpServletRequest mul) throws IllegalStateException, IOException {
		
		String bookname = mul.getParameter("bookname");
		String writer = mul.getParameter("writer");
		String memo = mul.getParameter("memo");
		int price = Integer.parseInt(mul.getParameter("price"));
		MultipartFile mf = mul.getFile("image");
		String image=mf.getOriginalFilename();
		UUID uuid = UUID.randomUUID();
		image=uuid.toString()+"-"+image;
		mf.transferTo(new File(path+"\\"+image));
		BookService service = sqlsession.getMapper(BookService.class);
		service.bookinsert(bookname,writer,memo,price,image);
		return "redirect:/main";
		
		
	}
	@RequestMapping(value = "/bookout")
	public String bookout(Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		if(login) {
		BookService service = sqlsession.getMapper(BookService.class);
		ArrayList<BookDTO> list = service.bookselect();
		model.addAttribute("list", list);
		return "bookout";
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter printwriter = response.getWriter();
			printwriter.print("<script>alert('로그인 후 이용 가능합니다')</script>");
			printwriter.print("<script>location.href='login'</script>");
			printwriter.close();
			return "redirect:/login";
		}
	}
	@RequestMapping(value = "/bookcountup")
	public String bookcountup(Model model,HttpServletRequest request) {
		int booknumber= Integer.parseInt(request.getParameter("booknumber"));
		BookService service = sqlsession.getMapper(BookService.class);
		service.countup(booknumber);
		BookDTO dto = service.countupview(booknumber);
		model.addAttribute("dto", dto);
		return "bookcountupview";
	}
	@RequestMapping(value = "/bookupdate")
	public String bookupdate(Model model,HttpServletRequest request) {
		int booknumber= Integer.parseInt(request.getParameter("booknumber"));
		BookService service = sqlsession.getMapper(BookService.class);
		BookDTO dto = service.bookupdateselect(booknumber);
		model.addAttribute("dto", dto);
		return "bookupdateview";
	}
	@RequestMapping(value = "/bookupdatego")
	public String bookupdatego(MultipartHttpServletRequest mul) throws IllegalStateException, IOException {
		int booknumber = Integer.parseInt(mul.getParameter("booknumber"));
		String bookname = mul.getParameter("bookname");
		String writer = mul.getParameter("writer");
		String memo = mul.getParameter("memo");
		int price = Integer.parseInt(mul.getParameter("price"));
		MultipartFile mf = mul.getFile("image");
		String image=mf.getOriginalFilename();
		UUID uuid = UUID.randomUUID();
		image=uuid.toString()+"-"+image;
		
		mf.transferTo(new File(path+"\\"+image));
		
		
		BookService service = sqlsession.getMapper(BookService.class);
		if(mf.isEmpty()) {
			service.bookupdatego2(bookname,writer,memo,price,booknumber); //이미지를 뺀 값들
			
			}
		else {
			service.bookupdatego(bookname,writer,memo,price,image,booknumber);
			String deleteimage=mul.getParameter("deleteimage");
			File file = new File(path+"\\"+deleteimage);
			file.delete();
		}
		
		return "redirect:/bookout";
	}
	@RequestMapping(value = "/bookdelete")
	public String bookupdelete(Model model,HttpServletRequest request) {
		int booknumber= Integer.parseInt(request.getParameter("booknumber"));
		BookService service = sqlsession.getMapper(BookService.class);
		BookDTO dto = service.bookdeleteselect(booknumber);
		model.addAttribute("dto", dto);
		return "bookdeleteview";
	}
	@RequestMapping(value = "/bookdeletego")
	public String bookdeletego(MultipartHttpServletRequest mul) {
		int booknumber = Integer.parseInt(mul.getParameter("booknumber"));
		String deleteimage=mul.getParameter("deleteimage");
			File file = new File(path+"\\"+deleteimage);
			file.delete();
		BookService service = sqlsession.getMapper(BookService.class);
		service.bookdeletego(booknumber);
		
		return "redirect:/bookout";
	}
	
	@RequestMapping(value = "/booksearch")
	public String booksearch(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		HttpSession hs = request.getSession();
		boolean login = (boolean)hs.getAttribute("loginstate");
		if(login) {
			return "booksearch";
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter printwriter = response.getWriter();
			printwriter.print("<script>alert('로그인 후 이용 가능합니다')</script>");
			printwriter.print("<script>location.href='login'</script>");
			printwriter.close();
			return "redirect:/login";
		}
	}
	@RequestMapping(value = "/booksearchgo")
	public String booksearchgo(HttpServletRequest request,Model model) {
		
		String data = request.getParameter("data");
		String result = request.getParameter("result");
		BookService service = sqlsession.getMapper(BookService.class);
		ArrayList<BookDTO> list = service.booksearchgo(data,result);
		 if (list == null) {
		        System.out.println("검색 결과가 없습니다.");
		    }
		    
		model.addAttribute("list", list);
		return "booksearchview";
	}
	@RequestMapping(value = "/reply")
	public String reply(HttpServletRequest request,Model model) {
		
		String data = request.getParameter("data");
		String result = request.getParameter("result");
		BookService service = sqlsession.getMapper(BookService.class);
		ArrayList<BookDTO> list = service.booksearchgo(data,result);
		 if (list == null) {
		        System.out.println("검색 결과가 없습니다.");
		    }
		    
		model.addAttribute("list", list);
		return "booksearchview";
	}
	
}
