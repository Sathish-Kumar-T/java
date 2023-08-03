import java.util.Scanner;

/*
 *  >-90 - A
 *  80-89- B
 *  70-79- c
 *  60-69- D
 *  >60- E
 *  
 * */

public class ifElse {
   
	public static void main(String[] args) {
	
//	int a=5,b=6;
		
	int mark;
//	
//    mark= (a<b)?a:b;
//	System.out.println(mark);
//	
	Scanner name = new Scanner(System.in);
	System.out.println("Enter Your marks (0-100)");
	 mark = name.nextInt();
	 
	 if(mark>90) 
		 System.out.println(" Grade is A");
	 else if(mark>=80)
		 System.out.println("Grade is B");
	 else if(mark>=70)
		 System.out.println("Grade is C");
	 else if(mark>=60)
		 System.out.println("Grade is D");
	 else
		 System.out.println("Grade is E");
	 name.close();	 
   
	 
	}
	
}
