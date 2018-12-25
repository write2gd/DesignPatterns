package com.gd.dependencyinversion.good;

import java.sql.Connection;

public interface DataSource {
	void createConnection(DatabaseConfig config);
	Connection getConnection();
	
}
