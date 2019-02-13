package Practicecorejavaclasses;



//package pack1;

public class xx {
	
	public int x;//public non static
	public int y;//public non static variable
	
	public xx() {//constructor without parameter
		x=1;
		y=1;
	}
	
	public xx(int a, int b) {
		System.out.println("Parameterized constrcutor called");
		x=a;
		y=b;
	}

	public static void main(String[] args) {
		xx obj = new xx();
		obj.add();//0
		obj.multiply();//0
		obj.printGreater();
		xx obj2 = new xx(10, 20);
		obj2.add();//30
		obj2.multiply();//200
		obj2.printGreater();
	}
	
	public void add() {
		System.out.println(x+y);
	}
	
	public void multiply() {
		System.out.println(x*y);
	}
	
	public void printGreater() {
		if(x>y)
			System.out.println(x);
		else if(y>x)
			System.out.println(y);
		else
			System.out.println("both are equal");
	}		
}

