package JavaOOPS;

public class runtimepoly {

	public static void main(String[] args) {
    CAR ob=null;
    String cartype="suzuki";
    if(cartype.equals("BMW"))
    	ob=new BMW();
    	else if(cartype.equals("benz")) 	
         ob=new benz();
    	else if(cartype.equals("suzuki"))
    		ob=new suzuki();
    	else 
    		System.out.println("Invalid car type");
    ob.start();
    ob.stop();
    ob.reverse();
	}

}
