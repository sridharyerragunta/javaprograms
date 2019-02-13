package Callingclassmenthodsinotherclass;

public class boxtest  {

	public static void main(String[] args) {
  
     box.hei=10; //static way- using public static variable of other class
     box ob=new box();
     ob.calc();//non static way..calling public non static variable of other calss
     box ob1=new box(25,35);//Parameterized constructor
     ob1.calc(); //non static way..calling public non static variable of other calss
    
     
	}

}
