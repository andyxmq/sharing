package com.sharing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sharing.bean.UserBean;
import com.sharing.dao.UserDao;
import com.sharing.entity.UserEntity;

@Controller
public class TestController {
	
	@Autowired
	UserDao user;
	
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	} 
	
	@ResponseBody
	@RequestMapping(value="/userInfo",method=RequestMethod.GET,produces="application/json")
	public List<UserEntity> userInfo(Model model){
		//Gson gson = new Gson();
		//List<UserEntity> userInfo = user.getUser();
		//System.out.println(gson.toJson(userInfo));
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/getUserInf1o", method=RequestMethod.GET)
	public UserEntity getUserInfo() {
		//UserEntity userInfo = user.getUserInfo(1);
		return null;
	}
}
