import java.util.Scanner;

public class switchVowOrConst {

	public static void main(String[] args) {
	String alpha;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Single Alphabet to find Vowles or Constant");
	alpha=scanner.nextLine();
			switch(alpha) {
			case "a | A" :
			case "e | E" :
			case "i | I" :
			case "o | O" :
			case "u | U" :
				System.out.println("Entered Alphabet " +  alpha +" " +"is vowel"); 
				break;
			default:
				System.out.println("Entered Alphabet " + alpha +" " +"is Constant");
				
			}
	
	scanner.close();

	}

}
