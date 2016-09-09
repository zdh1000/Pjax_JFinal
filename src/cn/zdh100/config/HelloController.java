package cn.zdh100.config;

import com.jfinal.core.Controller;

public class HelloController extends Controller {
	
	public void index() {
		render("index.html");
	}
	
	public void index0() {
		renderText("page 0");
	}
	
	public void index1() {
		renderText("page 1");
	}
	
	public void index2() {
		render("2.html");
	}

}
