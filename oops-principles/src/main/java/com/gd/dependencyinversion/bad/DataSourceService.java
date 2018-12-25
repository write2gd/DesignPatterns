package com.gd.dependencyinversion.bad;

import java.sql.Connection;

public interface DataSourceService {
	void createConnection(DatabaseConfig config);
	Connection getConnection();
	
}
