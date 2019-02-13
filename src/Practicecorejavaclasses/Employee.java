package Practicecorejavaclasses;

public class Employee {

	public int eid;//non-static global variable
	public double esal;
	public static String compName;//static global variable
	
	//static method
	public static void main(String[] args) {
		compName="mindq";
		Employee x=new Employee();
		x.eid=100;
		x.esal=1000;
		System.out.println(x.eid);
		System.out.println(x.esal);
		System.out.println(compName);
		x.display();
		
	}
	
	//non-static method
	public void display() {
		System.out.println(eid);
		System.out.println(esal);
		System.out.println(compName);
	}

}
