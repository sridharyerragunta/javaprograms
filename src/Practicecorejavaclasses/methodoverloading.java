package Practicecorejavaclasses;

public class methodoverloading {

	public static void main(String[] args) {
		sumAll();
		sumAll(100);
		sumAll(101, 200);
	}
	public static void sumAll() {
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
	}
	public static void sumAll(int n) {
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
	}
	
	public static void sumAll(int m, int n) {
		int sum=0;
		
		for(int i=m; i<=n; i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
	}

}
