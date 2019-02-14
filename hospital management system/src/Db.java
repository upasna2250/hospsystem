
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crack
 */
public class Db {
     public static Connection getConnection() throws ClassNotFoundException, SQLException
    {                                       
        Connection con = null;
        try
        {
    
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","1138");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        
        return con;
    }
    
}
