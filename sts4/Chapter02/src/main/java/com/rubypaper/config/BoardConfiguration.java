package com.rubypaper.config;

import com.rubypaper.jdbc.config.util.JDBCConnectionManager;

//@Configuration
public class BoardConfiguration {

//	@Bean
	public JDBCConnectionManager getJDBCConnectionManager() {
		JDBCConnectionManager manager = new JDBCConnectionManager();
		manager.setDriverClass("org.h2.Driver");
		manager.setUrl("jdbc:h2:tcp://localhost/~/test");
		manager.setUsername("sa");
		manager.setPassword("");
		return manager;
	}
}
