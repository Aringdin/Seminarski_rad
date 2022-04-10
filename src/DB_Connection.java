/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marko
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB_Connection {
    
    
public Connection getConnection(){
Connection connection=null;
try {
Class.forName("com.mysql.jdbc.Driver");
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seminarski_rad","root", "");

} catch (ClassNotFoundException e) {
e.printStackTrace();
} catch (SQLException e) {
e.printStackTrace();
}
return connection;
}

}