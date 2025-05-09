package jdbclms;

import java.sql.PreparedStatement;

public class Book 
{
	public void addBook(int bookid,String Title,String author, String publisher, int quantity)
	{
		try
		{
			DBConnect.getConnect();
			PreparedStatement ps = DBConnect.con.prepareStatement("insert into books values(?,?,?,?,?)");
			ps.setInt(1,bookid);
			ps.setString(2,Title);
			ps.setString(3,author);
			ps.setString(4,publisher);
			ps.setInt(5,quantity);
			int a = ps.executeUpdate();
			if(a>0) 
			{
				System.out.println("record inserted");
			}
			else
			{
			 System.out.println("record not inserted");
			}
			 ps.close();
			 DBConnect.con.close();
		}
		catch(Exception e)
		 {
			e.printStackTrace();
	     }
			
	  }
     public void updateBook(int bookid,String Title,String author, String publisher, int quantity)
     {
    	 try
    	 {
    		 DBConnect.getConnect();
 			PreparedStatement ps = DBConnect.con.prepareStatement("update books set  title=?,author=?, publisher=?,quantity=? where bookid=?");
 			ps.setString(1,Title);
 			ps.setString(2,author);
 			ps.setString(3,publisher);
 			ps.setInt(4,quantity);
 			ps.setInt(5,bookid);
 			int a = ps.executeUpdate(); 
 			if(a>0) 
			{
				System.out.println("updated succuessfully");
			}
			else
			{
			 System.out.println("update is unsuccessfull");
			}
			 ps.close();
			 DBConnect.con.close();
    	 }
    	 catch(Exception e)
		 {
			e.printStackTrace();
	     }
     }
     public void deleteBook(int bookid) throws Exception
     {
       DBConnect.getConnect();
       PreparedStatement ps = DBConnect.con.prepareStatement("delete from book where bookid=?");
	   ps.setInt(1,bookid);
	   int a = ps.executeUpdate(); 
		if(a>0) 
		{
			System.out.println("deleted  succuessfully");
		}
		else
		{
		 System.out.println("deletion is unsuccessfull");
		}
		 ps.close();
		 DBConnect.con.close();
	 }

}

