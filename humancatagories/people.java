package humancatagories;
import java.util.Scanner;
public class people {

	public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	  System.out.println("Enter your first name");  
	  String name=sc.nextLine(); 
	   System.out.println("Enter your last name");  
	   String lasname=sc.nextLine();  
	   System.out.println("Enter your middle intial");  
	   String mname =sc.nextLine(); 
	   System.out.println("whats your career?");
	   String career =sc.nextLine();
	   System.out.println("How old are you ");
	   int age =sc.nextInt();
	   
	   humantest person1 = new humantest(name,lasname,mname,career,age);
	   
	   System.out.print(person1.LastName);
	   
	   
	}   
		

	}


