package nav.bharti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	String dburl = "jdbc:mysql://localhost:3306/hospital";
    	String username = "root";
    	String pwd = "navbharti";
    	
        System.out.println( "Hello World!" );
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //2.
        Connection con = DriverManager.getConnection(dburl, username, pwd);
        
        //3. 
        //String query = "Create Table amity_students(id int, name varchar(50), address varchar(50))";
        String query = "drop table amity_students";
        
        Statement st = con.createStatement();
        
        //4
        int rows = st.executeUpdate(query);
        
        System.out.println(rows + " Table deleted Successfully!!!");
    }
}
