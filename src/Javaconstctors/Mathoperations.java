package Javaconstctors;

public class Mathoperations {
	
	public double x; //public non static variable declaration
	public double y; //public non static variable declaration

	public Mathoperations()
	{
		x=10;
		y=20;
	}
	
	public Mathoperations(int a, int b)
	{
		x=a;
		y=b;
	}
	public static void main(String[] args) {
     Mathoperations ob=new Mathoperations();
     ob.add();
     ob.mul();
     ob.sub();
     ob.div();
     Mathoperations ob1=new Mathoperations(40,50);
     ob1.add();
     ob1.mul();
     ob1.sub();
     ob1.div();
	}
   public void add(){
	   System.out.println(x+y);
   }
   
   public void mul(){
	   System.out.println(x*y);
   } 
   public void sub(){
	   System.out.println(x-y);
   }
   public void div(){
	   System.out.println(x/y);
   }
}
