
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author marko
 */
public class Connect_db {
    
    private static String servername="localhost";
    private static String dbname = "Seminarski_rad";
    private static String username="root";
    private static Integer portnumber=3306;
    private static String password="";
    
    //function to get connection
    
    public static Connection getTheconnection(){
        
        Connection connection = null;
        
        MysqlDataSource datasource= new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        
        try {
            connection = datasource.getConnection();
            System.out.println("connected to database");
        } catch (SQLException ex) {
            Logger.getLogger(Connect_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    public static void main (String[] args){
        Connect_db aid= new Connect_db();
    }
}
