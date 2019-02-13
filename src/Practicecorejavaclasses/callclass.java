package Practicecorejavaclasses;

public class callclass {

	public static void main(String[] args) {
		
		sample.hei=10;// calling static way
		System.out.println(sample.hei);
		sample s=new sample();
		
			s.calVol();//calling non static way
			
			
			sample.calVol(100);//calling  static way

	}

}
