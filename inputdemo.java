import java.util.Scanner;

public class inputdemo{

	public static void main(String[] args) {
		
	         Scanner scanner = new Scanner(System.in);
	         
	         System.out.println("what is your Name");
	         String name = scanner.nextLine();
	         
	         System.out.println("What is your rating? ");
	         int rating = scanner.nextInt();
	         scanner.nextLine();
	         
	         System.out.println("your Email");
	         String email = scanner.nextLine(); 
	         
	         System.out.println("Hello " + name);
	         System.out.println("Your Rating is "+rating);
	         System.out.println("your email is " + email);
	         
		     scanner.close();
		
		
	}

}
 