package JavaMethods;

public class methodreturnvalue {

	public static void main(String[] args) {
		
    int result,n;
    n=3;
    result=sum(n);
    System.out.println("square of 3 is"+result);
    n=5;
    result=sum(n);
    System.out.println("square of 5 is"+" "+result);

	
}
	
	
  public static int sum(int x){
	  
	  return x*x;
  }
}
