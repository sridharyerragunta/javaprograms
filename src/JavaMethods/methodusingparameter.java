package JavaMethods;

public class methodusingparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // math(10,20);
    //  math(30, 40);
      math(0, -0);
      mathtable(7);
     // mathtable(10);
	}
  public static void math(int x, int y){
	  int res=x*y;
	  System.out.println(res);
  }
  public static void mathtable(int x){
	for(int i=1; i<=10;i++) {
		System.out.println(x+"*"+i+"="+x*i);
	}
  }
}
