package JavaMethods;

public class Methidreturnminvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=5;
  int b=2;
  double c=23.5;
  double d=23.51;
  int res1=min(a,b);
 double  res2=min(c,d);
 System.out.println("minimum values of"+"  "+a+"and "+b +" is"+" "+res1);
 System.out.println("minimum values of"+"  "+c+"and "+d +" is"+" "+res2);
  
	}
 public static int min(int x, int y){
	 int min;
	 if(x<y)
		 min=x;
	 else
		 min=y;
	 return min;
 }
 public static double min(double x, double y){
	 double  min;
	 if(x<y)
		 min=x;
	 else
		 min=y;
	 return min;
}
}