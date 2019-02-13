package Practicecorejavaclasses;

public class Box {

	public static int hei;
	public int len;
	public int wid;
		
	public static void main(String[] args) {
		hei=10;
		
		Box obj1 = new Box();
		obj1.len=20;
		obj1.wid=30;
		obj1.calVol();//20*30*10
		
		Box obj2 = new Box();
		obj2.len=5;
		obj2.wid=6;
		obj2.calVol();//5*6*10

		

	}

	public void calVol() {
		System.out.println(len*wid*hei);
	}
}
