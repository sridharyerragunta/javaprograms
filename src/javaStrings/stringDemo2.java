package javaStrings;

public class stringDemo2 {

	public static void main(String[] args) {
		String str="Good morning!";
	
		System.out.println(str);
		String str1=str.concat("how are");
		System.out.println(str1);
		System.out.println(str.concat("how are you"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String str3= "how are you";
		String str4="How are you";
		System.out.println(str3==str4);
		System.out.println(str3.equalsIgnoreCase(str4));
	}

}
