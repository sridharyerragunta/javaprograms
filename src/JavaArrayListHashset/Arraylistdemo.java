package JavaArrayListHashset;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
ArrayList<String> a=new ArrayList<String>();
 System.out.println(a.size());
 a.add("India");
 a.add("USA");
 a.add("UK");
 a.add("India");
 a.add("Singapore");
 System.out.println(a.size());
 System.out.println(a.get(1));
 System.out.println(a.get(3));
 for(int i=0;i<a.size();i++){
	 System.out.println(i+"-->"+a.get(i));
 }
 
 a.remove(1);
 for(int i=0;i<a.size();i++){
	 System.out.println(i+"-->"+a.get(i));
 }

	}}
