package Sort;

public class Overload 
{
	int a;
	int b;
	int sum=0;
	public void add() {
		int a=4;
		int b=5;
		sum=a+b;
		System.out.println(sum);
		}
	public void add(int a,float b) {
		 
		
		System.out.println("sum="+(a+b));
		
	}
public void add(float a,float b) {
		 
		
		System.out.println("sum="+(a+b));
		
	}
	public static void main(String[] args) {
		Overload ol=new Overload();
		ol.add();
		ol.add(4, 8);
		ol.add(12.4f, 12.3f);
	}

}
