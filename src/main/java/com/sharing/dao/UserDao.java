/**
 * 
 */
package com.sharing.dao;

import java.util.List;

import com.sharing.entity.UserEntity;

/**
 * @author xumingquan
 *
 */
public interface UserDao {
	
	//查询用户
	public UserEntity queryByPrimaryKey(int id);
	
	//删除用户
	public int deleteByPrimaryKey(int id);
	
	//更新用户
	public int updateByPrimary(UserEntity user);
	
	//添加用户
	public int addUser(UserEntity user);
	
	//查询所有用户
	public List<UserEntity> findAll();
	
	
	
	
}
