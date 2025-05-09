package jdbclms;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{
	public static Connection con;
	public static void getConnect()
	{
		 try
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver loaded");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","tiger");
			 System.out.println("Connection is established");
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		
	}

}
