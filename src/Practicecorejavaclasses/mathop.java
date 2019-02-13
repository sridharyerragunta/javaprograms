package Practicecorejavaclasses;

public class mathop {
	public int x;
	public int y;
	public static void main(String[] args) {

     mathop ob=new mathop();
    	 ob.x=10;
         ob.y=30;
         ob.add();
     ob.mult1();
    ob.printgrno();
	}
  public void add(){
	  System.out.println(x+y);
  }
  public void mult1(){
	  System.out.println(x*y);
  }
  public void printgrno(){
	  if(x>y)
		  System.out.println(x+" "+ "is grethan"+" " +y);
	  else
		  System.out.println(x+" "+ "is lessthan"+" " +y);
  }
}
