package Sort;

import java.util.Arrays;

public class RemoveArrayEle {

	public static void main(String[] args) {
		int arr[]= {21,23,52,65,35,98,75};
		System.out.println("original: "+Arrays.toString(arr));
		int remove=2;
		//int i=remove;
		for(int i=remove;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("removed:"+Arrays.toString(arr));
	}

}
