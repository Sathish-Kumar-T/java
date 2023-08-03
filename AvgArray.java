package Sort;

public class AvgArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23, 30, 25, 35, 16, 60, -100};
		int sum=0;
		double avg=0;
//		for(int i=0;i<arr.length;i++) {
//		sum=sum+arr[i];	
//		
//		}
		for(int k:arr) {
			sum=sum+k;
		}
		System.out.println("Sum =" +sum);
		avg=(sum/arr.length);
		System.out.println("Average ="+avg);
		System.out.println(arr.length);
	}

}
