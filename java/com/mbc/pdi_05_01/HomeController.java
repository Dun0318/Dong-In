package com.mbc.pdi_05_01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@Autowired
	SqlSession sqlSession;
	@RequestMapping(value = "/")
	public String home(HttpServletRequest request) {
		HttpSession hs=request.getSession();
		hs.setAttribute("loginstate", false);
		return "main";
	}
	@RequestMapping(value = "/main")
	public String home2() {
		
		return "main";
	}
	
}
