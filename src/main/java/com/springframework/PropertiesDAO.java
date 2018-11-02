package com.springframework;

public class PropertiesDAO {

	private String dbServer;
	private String dbUser;
	private String dbPass;
	private String url;
	private int dbPort;
	
	public PropertiesDAO(String dbServer, String dbUser, String dbPasswd, int port, String url) {
		this.dbServer = dbServer;
		this.dbUser = dbUser;
		this.dbPass = dbPasswd;
		this.url = url;
		this.dbPort = port;
	}

	@Override
	public String toString() {
		return "PropertiesDAO [dbServer=" + dbServer + ", dbUser=" + dbUser + ", dbPass=" + dbPass + ", url=" + url
				+ ", dbPort=" + dbPort + "]";
	}
}
