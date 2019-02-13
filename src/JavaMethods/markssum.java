package JavaMethods;

public class markssum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int result=0;
    result=sumall(101);
    if (result>5000)
    	System.out.println(" student is passed");
    else
    	System.out.println("student is failed");
	}
 public static int sumall(int n){
	 int sum=0;
	 for(int i=0;i<=n;i++){
		 sum=sum+i;
	 }
	 return sum;
 }
}
