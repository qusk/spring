package com.yjm.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yjm.demo.controller.Article;
import com.yjm.demo.dao.ArticleDao;


@Controller
public class ArticleController {
	
	ArrayList<Integer> nlist = new ArrayList<Integer>();
	
	@RequestMapping("addNumber")
	@ResponseBody
	public String addNumber(int num) {
		
		nlist.add(num);
		
		return "추가되었습니다";
	}
	
	@RequestMapping("ShowAllValues")
	@ResponseBody
	public ArrayList<Integer> ShowAllValues() {
		
		return nlist;
		
	}
	
	ArticleDao dao = new ArticleDao(); 
	
	@RequestMapping("addArticle")
	@ResponseBody
	public String addArticle(int id, String body, String nick, String title) {
		
		dao.insertArticle(id, body, title, nick);
		
		return "article";
		
	}
	
	@RequestMapping("list")
	@ResponseBody
	public String list() {
		
		ArrayList<Article> list = dao.getArticles();
		
		return "list";
	}
	
	
}
