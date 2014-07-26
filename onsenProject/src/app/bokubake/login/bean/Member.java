package app.bokubake.login.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Member implements Serializable {

	private BigDecimal id;
	private String userId;
	private String passWord;
	private String userName;
	private String twitterId;
	private String myPhotoPath;


	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTwitterId() {
		return twitterId;
	}
	public void setTwitterId(String twitterId) {
		this.twitterId = twitterId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getMyPhotoPath() {
		return myPhotoPath;
	}
	public void setMyPhotoPath(String myPhotoPath) {
		this.myPhotoPath = myPhotoPath;
	}

}
