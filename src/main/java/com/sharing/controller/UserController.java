package com.sharing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sharing.entity.UserEntity;
import com.sharing.service.IUserService;
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	//显示用户页面
	@RequestMapping("/showUser")
	public String showUser(){
		return "user/showUser";
	}
	
	//显示主页面
	@RequestMapping("/index")
	public String userIndex(){
		return "user/index";
	}
	
	//根据ID查找用户
	@ResponseBody
	@RequestMapping(value="/getUserInfo",method=RequestMethod.GET,produces="application/json")
	public UserEntity getUserInfo(@RequestParam("userId") int id,Model model){
		Gson gson = new Gson();
		System.out.println(gson.toJson(userService.getUserById(id)));
		return userService.getUserById(id);	
	}
	
	//查询所有的用户
	@ResponseBody
	@RequestMapping(value="getUserList",method=RequestMethod.GET,produces="application/json")
	public List<UserEntity> getUserList(){
		return null;
	}
	
	//添加用户
	@ResponseBody
	@RequestMapping(value="/addUser",method=RequestMethod.POST,produces="application/json")
	public void addUser(UserEntity user){
		Gson gson = new Gson();
		System.out.println(gson.toJson(user)+"===");
		userService.addUser(user);
	} 
	
	//添加用户
	@RequestMapping("/add")
	public String add(UserEntity userEntity){
		Gson gson = new Gson();
		System.out.println(gson.toJson(userEntity));
		int num = userService.addUser(userEntity);
		System.out.println(num);
		return "user/success";
	}
	
	//删除用户
	@RequestMapping("/delete")
	public String delete(int id){
		userService.deleteUser(id);
		return "user/success";
	}
	
	//查询用户
	@RequestMapping("/get")
	public String get(int id,HttpServletRequest request){
		UserEntity  userEntity = userService.getUserById(id);
		request.setAttribute("user", userEntity);
		return "user/show";
	}
	//更新用户
	@RequestMapping("/update")
	public String update(UserEntity user){
		userService.updateUser(user);
		System.out.println((new Gson()).toJson(user));
		return "user/success";
	}
	
	@RequestMapping("/userList")
	public String userList(HttpServletRequest request){
		Gson gson = new Gson();
		List<UserEntity> list = userService.getUserList();
		System.out.println(gson.toJson(list));
		request.setAttribute("users", list);
		return "user/userList";
	}
}
