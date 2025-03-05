package com.hcl.datamanagement.dto;

public class DataSourceDto {

	private Integer altKey;
	private String dbName;
	private String userName;
	private String password;
	private String portNumber;
	private String hostName;

	public DataSourceDto() {
		super();
	}

	public DataSourceDto(Integer altKey, String dbName, String userName, String password, String portNumber,
						 String hostName) {
		super();
		this.altKey = altKey;
		this.dbName = dbName;
		this.userName = userName;
		this.password = password;
		this.portNumber = portNumber;
		this.hostName = hostName;
	}

	public Integer getAltKey() {
		return altKey;
	}

	public void setAltKey(Integer altKey) {
		this.altKey = altKey;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
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

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	@Override
	public String toString() {
		return "DataSourceDto [altKey=" + altKey + ", dbName=" + dbName + ", userName=" + userName + ", password="
				+ password + ", portNumber=" + portNumber + ", hostName=" + hostName + "]";
	}

}