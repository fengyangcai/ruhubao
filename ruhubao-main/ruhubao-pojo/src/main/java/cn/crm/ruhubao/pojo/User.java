package cn.crm.ruhubao.pojo;

import java.util.Arrays;

public class User {
    private Integer id;

    private String userName;

    private String password;

    private String nickname;

    private String gender;

    private String telephone;

    private String station;

    private String remark;

    private byte[] loginIp;

	public User() {
		super();
	}

	public User(Integer id, String userName, String password, String nickname, String gender, String telephone,
			String station, String remark, byte[] loginIp) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.nickname = nickname;
		this.gender = gender;
		this.telephone = telephone;
		this.station = station;
		this.remark = remark;
		this.loginIp = loginIp;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", nickname=" + nickname
				+ ", gender=" + gender + ", telephone=" + telephone + ", station=" + station + ", remark=" + remark
				+ ", loginIp=" + Arrays.toString(loginIp) + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public byte[] getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(byte[] loginIp) {
		this.loginIp = loginIp;
	}

	
   
}