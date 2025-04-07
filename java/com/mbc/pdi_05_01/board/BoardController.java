package com.mbc.pdi_05_01.board;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@Autowired
	SqlSession sqlsession;
	@RequestMapping(value = "/announcementinput")	
	public String announcementinput() {
		
		return "announcementinput";
	}
	@RequestMapping(value = "/announcementsave")	
	public String announcementsave(BoardDTO dto) {
		String title = dto.getTitle();
		String text = dto.getText();
		
		BoardService service = sqlsession.getMapper(BoardService.class);
		service.announcementinsert(title,text);
		return "redirect:/main";
	}
	
	@RequestMapping(value = "/announcementout")	
	public String announcementout(Model model) {
		BoardService service = sqlsession.getMapper(BoardService.class);
		ArrayList<BoardDTO> list = service.announcementselect();
		model.addAttribute("list", list);
		return "announcementout";
	}
	@RequestMapping(value = "/announcementtext")	
	public String announcementtext(Model model,HttpServletRequest request) {
		int num =Integer.parseInt(request.getParameter("num"));
		BoardService service = sqlsession.getMapper(BoardService.class);
		BoardDTO dto= service.announcementtext(num);
		model.addAttribute("dto", dto);
		return "announcementtextview";
	}
	
	@RequestMapping(value = "/boardinput")	
	public String boardinput() {

		return "boardinput";
	}
	@RequestMapping(value = "/boardsave")	
	public String boardsave(BoardDTO2 dto) {
		String title = dto.getTitle();
		String writer = dto.getWriter();
		String text = dto.getText();
		BoardService service = sqlsession.getMapper(BoardService.class);
		service.boardinsert(title,writer,text);
		
		return "redirect:/main";
	}
	
	@RequestMapping(value = "/boardout")	
	public String boardout(Model model) {
		BoardService service = sqlsession.getMapper(BoardService.class);
		ArrayList<BoardDTO2> list = service.boardselect();
		model.addAttribute("list", list);
		
		return "boardout";
	}
	
	@RequestMapping(value = "/detail")	
	public String detail(Model model,HttpServletRequest request) {
		int boardnumber=Integer.parseInt(request.getParameter("boardnumber"));
		BoardService service = sqlsession.getMapper(BoardService.class);
		service.countup(boardnumber);
		BoardDTO2 dto = service.detailselect(boardnumber);
		model.addAttribute("dto", dto);
		
		return "detail";
	}
	
	@RequestMapping(value = "/reply")	
	public String reply(HttpServletRequest request,Model model) {
		int boardnumber=Integer.parseInt(request.getParameter("boardnumber"));
		BoardService service = sqlsession.getMapper(BoardService.class);
		BoardDTO2 dto = service.replyselect(boardnumber);
		model.addAttribute("dto", dto);
		
		return "reply";
	}
	@RequestMapping(value = "/replygo")	
	public String replygo(HttpServletRequest request,Model model) {
	
		int groups = Integer.parseInt(request.getParameter("groups"));
		int temp = Integer.parseInt(request.getParameter("temp"));
		int indent = Integer.parseInt(request.getParameter("indent"));
		
		String title= request.getParameter("title");
		String writer= request.getParameter("writer");
		String text = request.getParameter("text");
		
		
		
		BoardService service = sqlsession.getMapper(BoardService.class);
		service.stetup(groups,temp);
		temp++;
		indent++;
		
		service.reply(title,writer,text,groups,temp,indent);
		
		return "redirect:/main";
	}
	
}
