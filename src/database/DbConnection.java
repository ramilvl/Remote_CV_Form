package database;

import java.sql.Connection;
import java.beans.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection { //Super Class
    private final String HOST ="localhost";
    private final String PORT ="3306";
    private final String DATABASE_NAME = "cvresume";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    protected Connection connection = null;
    protected Statement statement = null;
    
    public DbConnection()
    {
        String url = "jdbc:mysql://" + this.HOST+":" + "/" + this.DATABASE_NAME;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.connection=(Connection) DriverManager.getConnection(url,this.USER,this.PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
