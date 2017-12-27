/**
 * 
 */
package com.sharing.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.sharing.bean.UserBean;
import com.sharing.dao.UserDao;
import com.sharing.entity.UserEntity;

/**
 * @author xumingquan
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/config/applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	UserDao user;
	
	@Test
	public void testCRUD(){
		Gson gson = new Gson();
		//List <UserEntity> userInfo = user.getUser();
		//System.out.println(gson.toJson(userInfo));
	}
}
