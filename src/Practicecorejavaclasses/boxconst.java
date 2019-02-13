package Practicecorejavaclasses;

public class boxconst {
	
	public int len;
	public int wid;//public non static variable
	public static int hei;//public static variable

	 public boxconst(){
		 len=1;
		 wid=2;
	 }
	 public boxconst(int l, int w){
		 System.out.println("parameterized const called");
		 len=l;
		 wid=w;
	 }
	public static void main(String[] args) {
		
      hei=100;
     boxconst ob=new boxconst();
     ob.math();
    	  boxconst ob1=new boxconst(10,20);
    	  ob1.math();
      }
	public void math(){
		System.out.println(len*wid*hei);;
	}
	}


