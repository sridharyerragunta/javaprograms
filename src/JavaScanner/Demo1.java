package JavaScanner;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
  System.out.println("enter variable x:  ");
  
   int x=s.nextInt();
   System.out.println(x/2);
   System.out.println("enter employee name :  ");
   String ename=s.next();
   System.out.println(ename);
   String ename1=s.nextLine();
   System.out.println(ename1);
	}

}
