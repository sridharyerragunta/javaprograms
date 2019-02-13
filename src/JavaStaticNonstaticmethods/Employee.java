package JavaStaticNonstaticmethods;

public class Employee {
	public int empno;
    public double sal;
    public static String compname;
	//static method
    public static void main(String[] args) {
		
	 compname="SRIDHAR";  //static variable
	 Employee obj=new Employee();
	 obj.empno=10; //non static variable
	 obj.sal=1000;
	 Employee obj1=new Employee();
	 obj1.empno=20;
	 obj1.sal=2000;
	 obj.display();
	 obj1.display();
	 
	}
	 //Non static method
	 public void display(){
		 System.out.println(empno+"  >"+sal+"-->"+compname);
	 }
}
	    
	    


