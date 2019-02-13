package Callingclassmenthodsinotherclass;

public class box {
public static int hei;
public int len;
public int wid;

public box(){
	len=10;
	wid=20;
}
public box(int a, int b){
	len=a;
	wid=b;
}
public void calc(){
	System.out.println(len*wid*hei);
}
}
