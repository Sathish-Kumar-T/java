import java.util.Scanner;

public class firstNOddNumbersUsingLoop {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scanner.nextInt();
		
		scanner.close();
		for(int i=1;i<=num;i++) {
			int oddNum = (2*i)-1;
			System.out.println("The First "+num+" Odd Numbers is "+ oddNum);
			
		}
	}

}
