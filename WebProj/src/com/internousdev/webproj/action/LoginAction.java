package com.internousdev.webproj.action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;//この値をlogin.jspのプロパティタグで取得
	private String password;

	public String execute(){
		return SUCCESS;
	}

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){//welcome.jspでユーザーが入力したものをセット
		this.username=username;
	}


	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}



}
