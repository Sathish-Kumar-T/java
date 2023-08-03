import java.util.Scanner;

public class switchStatement {

	public static void main(String[] args) {
	int a,b;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the First Number");
	a=scanner.nextInt();
	System.out.println("Enter the Second Number");
	b=scanner.nextInt();
	char operator;
	System.out.println("Enter the operator +,-,*,/ or % ");
	operator=scanner.next().charAt(0);
	
	switch(operator) {
	case '+':
		System.out.println(a + "+" + b + "=" +(a+b));
		break;
	case '-':
		System.out.println(a + "-" + b + "=" +(a-b));
		break;
	case '*' :
		System.out.println(a + "*" + b + "=" +(a*b));
		break;
	case '/' :
		System.out.println(a + "/" + b + "=" +(a/b));
		break;
	case '%' :
		System.out.println(a + "%" + b + "=" +(a%b));
		default:
			System.out.println("Entered invaild Operator");
	}
	
	
	scanner.close();
	
	
	}

}
