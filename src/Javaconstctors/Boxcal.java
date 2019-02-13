package Javaconstctors;

public class Boxcal {
    public int len; //non static public variable
    public int wid; //public non static variable declaration
    public static int hei; //public static variable declaration class variable 
    // all class members can be used
    
    public Boxcal()
    { //Defining default constructor to pass values to instance objects
    	 len=10;
    	 wid=20;
    	}
    
    public Boxcal(int a, int b){	
    	 len=a;
    	 wid=b;
    }
    
    
	public static void main(String[] args) {

		hei=10;
		Boxcal obj=new Boxcal();
		obj.math();
		
		Boxcal obj1=new Boxcal(5,25);
		
		obj1.math();
	}
	
	public void math(){
		System.out.println(len*wid*hei);
	}
	

}
