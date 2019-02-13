package Practicecorejavaclasses;

public class sample {

	public static int hei;
	public int len;
	public int wid;
	
	public sample() {
		len=1;
		wid=1;
	}
	
	public sample(int l, int w) {
		len=l;
		wid=w;
	}
		
	public  void calVol() {
		System.out.println(len*wid*hei);
	}
	public static void calVol(int x) {
		int sum=0;
		for(int i=0;i<=x;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}


