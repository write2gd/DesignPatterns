package com.gd.openclosed.bad;

import java.sql.Connection;

public class ConnectionServiceBean implements ConnectionService {

    public Connection mysqlConnection() {
        // TODO establish connection to MySQL database
        return null;
    }

    public Connection msServerConnection() {
        // TODO establish connection to ms-server database
        return null;
    }

    public Connection h2Connection() {
        // TODO establish connection to h2 database
        return null;
    }

}
