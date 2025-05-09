package jdbclms;
import java.util.Scanner;
public class lmsMain

{
	public static void main (String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		borrow b2 = new borrow();
		Book b1 = new Book();
		boolean a = true;
		while(a)
		{
			System.out.println("Enter your choice");
			System.out.println("1. Add book");
			System.out.println("2.Updatebook");
			System.out.println("3.deletebook");
			System.out.println("enter borrow details");
			System.out.println("4. Add borrowsdetails");
 			System.out.println("5.Updateborrowsdetails");
 			System.out.println("6.deleteborrowsdetails");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter a bookid:");
				int bookid = sc.nextInt();
				sc.nextLine();
				System.out.println("enter booktitle:");
				String title =sc.nextLine();
				System.out.println("entetr auther name:");
				String auther =sc.nextLine();
				System.out.println("enter a publishher:");
				String publisher =sc.nextLine();
				System.out.println("enter the qunatity:");
				int  quantity = sc.nextInt();
				b1.addBook(bookid,title,auther,publisher,quantity);
				break;
			case 2:
				System.out.println("enter a bookid:");
				int bookidd = sc.nextInt();
				sc.nextLine();
				System.out.println("enter booktitle:");
				String titlee =sc.nextLine();
				System.out.println("entetr auther name:");
				String autherr =sc.nextLine();
				System.out.println("enter a publishher:");
				String publisherr =sc.nextLine();
				System.out.println("enter the qunatity:");
				int  quantityy= sc.nextInt();
				b1.updateBook(bookidd,titlee,autherr,publisherr,quantityy);
		         break;
			case 3:
				System.out.println("enter a bookid:");
				int bookiddd = sc.nextInt();
				sc.nextLine();
				b1.deleteBook(bookiddd);
		          break;
			case 4 :
				System.out.println("enter a borrowesid:");
				int borrowesid = sc.nextInt();
				sc.nextLine();
				System.out.println("enter borowersname:");
				String name =sc.nextLine();
				System.out.println("entetr borrowersemail:");
				String email =sc.nextLine();
				System.out.println("enter a borrowersphono:");
				int phono =sc.nextInt();
				b2.register(borrowesid,name,email,phono );
				break;
		}
	}
		sc.close();
	}
}