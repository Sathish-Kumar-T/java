import java.util.Scanner;

public class factorialUsiingLoop {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =scanner.nextInt();
		scanner.close();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("The Factorial of "+ num+" is "+fact);
	}

}
