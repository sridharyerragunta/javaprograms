package JavaStaticNonstaticmethods;

public class Boxcal {

	public static int hei=10;
	public int len;
	public int wid;
		
	public static void main(String[] args) {
		
		
		Boxcal obj1 = new Boxcal();
		obj1.len=20;
		obj1.wid=30;
		obj1.calVol();//20*30*10
		obj1.calVoladd();
		
		Boxcal obj2 = new Boxcal();
		obj2.len=5;
		obj2.wid=6;
		obj2.calVol();//5*6*10
		obj2.calVoladd();
		
		Boxcal obj3 = new Boxcal();
		obj3.len=5;
		obj3.wid=6;
		obj3.calVol();//5*6*10
		obj3.calVoladd();
		}

	public void calVol() {
		int sum=10;
		sum=sum+(len*wid*hei);
		System.out.println(sum);
	}
	public void calVoladd() {
		int val=100;
		val=val+(len+wid+hei);
		System.out.println(val);
	}
	
}
