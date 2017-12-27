/**
 * 
 */
package com.sharing.service;

import java.util.List;

import com.sharing.entity.UserEntity;

/**
 * @author xumingquan
 *
 */
public interface IUserService {
	//查询用户
	public UserEntity getUserById(int userId);
	
	//添加用户
	public int addUser(UserEntity user);
	
	//获取所有用户
	public List<UserEntity> getUserList();
	
	//删除用户
	public int deleteUser(int id);
	
	//更新用户
	public int updateUser(UserEntity user);
}
