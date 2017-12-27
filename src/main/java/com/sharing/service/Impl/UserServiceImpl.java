/**
 * 
 */
package com.sharing.service.Impl;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;
import com.sharing.dao.UserDao;
import com.sharing.entity.UserEntity;
import com.sharing.service.IUserService;

/**
 * @author xumingquan
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see com.sharing.service.IUserService#getUserById(int)
	 */
	//查询用户
	public UserEntity getUserById(int userId) {
		return userDao.queryByPrimaryKey(userId);
	}

	public int addUser(UserEntity user) {		
		return userDao.addUser(user);
	}

	public List<UserEntity> getUserList() {
		return userDao.findAll();
	}

	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteByPrimaryKey(id);
	}

	public int updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userDao.updateByPrimary(user);
	}
	
	

}
