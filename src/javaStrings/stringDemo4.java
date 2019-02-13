package javaStrings;

public class stringDemo4 {

	public static void main(String[] args) {
  String str="USD1,234";
  str=str.substring(3);
  str=str.replace(",", "");
  System.out.println(str);
  System.out.println(Integer.parseInt(str)*65);
	}

}
