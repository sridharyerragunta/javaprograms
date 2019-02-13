package JavaOOPS;

public class TestCar  {

	public static void main(String[] args) {
     CAR ob=new CAR();
     ob.start();
     ob.stop();
     ob.reverse();
   //2. child class object
     
     BMW ob1=new BMW();
     ob1.start();
     ob1.stop();
     ob1.accel();
     
     
     benz ob2=new benz();
     ob2.start();
     ob2.rooftop();
     
     
     CAR ob4=new BMW();
     
     ob4.start();
     ob4.stop();
     ob4.reverse();
    // ob4.accel;
	}
  //3. child calss obj
	
	
	
	
}
