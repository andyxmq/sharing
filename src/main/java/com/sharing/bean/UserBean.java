/**
 * 
 */
package com.sharing.bean;



/**
 * @author xumingquan
 *
 */
public class UserBean {
	/**
	 * 
	 */
	private int userID;
	private String userName;
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public UserBean() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString(){
		return this.userID+"-"+this.userName;
	}
}
