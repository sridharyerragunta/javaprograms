package javaStrings;

public class strDemo3 {

	public static void main(String[] args) {
		
		String str = "Hi Class, Good morning!";
		
		String strArray[]=str.split(" ");
		System.out.println(strArray.length);
		System.out.println(strArray[0]);
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}					
	}
}

