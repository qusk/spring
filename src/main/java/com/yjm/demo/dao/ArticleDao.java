package com.yjm.demo.dao;

import com.yjm.demo.controller.Article;
import java.util.ArrayList;

public class ArticleDao {

	ArrayList<Article> articles = new ArrayList<Article>(); 
	
	public void insertArticle(int id, String body, String title, String nick) {
		
		Article a = new Article();
		
		a.setId(id);
		a.setTitle(title);
		a.setBody(body);
		a.setNick(nick);
		
		articles.add(a);
		
	}
	
	public ArrayList<Article> getArticles() {
		
		return this.articles; 
	}
	
}
