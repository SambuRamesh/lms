package jdbclms;
import java.sql.PreparedStatement;
public class borrow
{
  public void register(int id,String name,String email,int phono)
  {
	    	 try
	    	 {
	    		DBConnect.getConnect();
	 			PreparedStatement ps = DBConnect.con.prepareStatement("insert into borrowes values(?,?,?,?)");
	 			ps.setInt(1,id);
	 			ps.setString(2,name);
	 			ps.setString(3,email);
	 			ps.setInt(4,phono);
	 			int a = ps.executeUpdate(); 
	 			if(a>0) 
				{
					System.out.println("register succuessfully");
				}
				else
				{
				 System.out.println("registraion is unsuccessfull");
				}
				 ps.close();
				 DBConnect.con.close();
	    	 }
	    	 catch(Exception e)
			 {
				e.printStackTrace();
			 }

	 	  } 
  }


