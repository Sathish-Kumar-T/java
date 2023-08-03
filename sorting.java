package Sort;

import java.util.Arrays;

public class sorting {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12345,54321,87654,98765,456};
		String name[]= {"asdfg","jhgf","okn","rfhg","lkjhg"};
	System.out.println("Original String;" + Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println("Original String;" +Arrays.toString(arr));
	
	System.out.println("Original String;" + Arrays.toString(name));
	Arrays.sort(name);
	System.out.println("Original String;" +Arrays.toString(name));
	
	}

}
