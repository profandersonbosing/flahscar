package br.com.unipar.flashcar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andersonbosing
 */
public class DatabaseConnection {
    
    public Connection getConnection() throws SQLException {
        
        return DriverManager.getConnection("jdbc:h2:~/h2database/flashcar", "", "");
        
    }
    
}
