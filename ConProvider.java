package company;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Establishes connection to the database.
 *
 */
public class ConProvider {

	private static Connection con=null;
	
	public static Connection getConnection(){
	
	try{
		Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/company"+
                "?verifyServerCertificate=false"+
                "&useSSL=false"+
                "&requireSSL=false";
        String username = "root"; //user name
        String password = "vani@2006"; // There is no password
        con = DriverManager.getConnection(url, username,password);
	}catch(Exception e){
		System.out.println(e);
		}
	return con;
    }
}