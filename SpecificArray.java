package Sort;

public class SpecificArray {
	public static boolean contain(int arr[],int item) {
		for (int n : arr) {
	         if (item == n) {
	             return true;
	          }
	       }
	       return false;
	    }
		

	public static void main(String[] args) {
		int[] arr = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
	      System.out.println(contain(arr, 2013));
	      System.out.println(contain(arr, 2015));
	   }

}

