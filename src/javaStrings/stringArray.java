package javaStrings;

public class stringArray {

	public static void main(String[] args) {
     char c[]={'a','e','i','o','u'};
     String str=new String(c);
     System.out.println(str);
     System.out.println(str.charAt(4));
     System.out.println(str.startsWith("a"));
     System.out.println(str.endsWith("o"));
     

		String str6=new String("Hi Good Morning");
		//public String concat(String str);
		
		System.out.println(str6);
		
		System.out.println(str6.contains("Hi"));
		System.out.println(str6.startsWith("Good"));
		System.out.println(str6.endsWith("Morning"));
		System.out.println(str.substring(3));
		System.out.println(str6.substring(2,5));
		
		String str4 = new String("Good morning!");
		System.out.println(str4.substring(5,8));


	}

}
