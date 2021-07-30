package com.tech.one.controller;

import java.io.FileInputStream;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Controller
public class BController {
	
	public JdbcTemplate template;
	
	/*public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template=this.template;
	}
	@Autowired
	private SqlSession sqlSession;
	*/
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request,
			Model model) {
		System.out.println("pass by list()");

		return "list";
	}
}