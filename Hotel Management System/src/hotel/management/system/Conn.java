
package hotel.management.system;

import static java.lang.Class.forName;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///projecthms","root","nitish");
            s=c.createStatement();
        }
            
     catch(Exception e)
    {
        e.printStackTrace();
    }
        
    
}}
