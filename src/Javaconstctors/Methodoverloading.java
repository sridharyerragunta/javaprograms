package Javaconstctors;

public class Methodoverloading {

	public static void main(String[] args) {
		sumAll();
		sumAll(100);
		sumAll(101,200);

	}
  public static void sumAll(){
	  int sum=0;
	  for(int i=0; i<10; i++){
		  sum=sum+i;
	  }
	  System.out.println(sum);
  }
  public static void sumAll(int a, int b){
	  int sum=0;
	  for (int i=a;i<=b;i++){
		  sum=sum+i;
	  }
	  System.out.println(sum);
  }
  public static void sumAll(int n){
	  int sum=0;
	  for(int i=0; i<n; i++){
		  sum=sum+i;
	  }
	  System.out.println(sum);
  }
}


