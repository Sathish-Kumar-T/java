import java.util.Scanner;

public class naturalNumberUsingLoop  {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		scanner.close();
		
		int sum = 0 ;
		for(int i=1;i<=num;i++) {
			
			sum= num*(num+1)/2;
			
		}
	
		System.out.println("The Sum of "+num+" Natural Numbers is "+sum);
	}

}
