package javaStrings;

public class stringDemo6 {

	public static void main(String[] args) {
    String original="   hi team good morning";
    String newstr="";
    original=original.trim();
    System.out.println(original);
	
    String[] starArr=original.split(" ");
    System.out.println(starArr.length);
    String str1="";
    String str2="";
    for(int i=0;i<starArr.length;i++){
    	str1=String.valueOf(starArr[i].charAt(0)).toUpperCase();
    	str2=starArr[i].substring(1);
    	newstr=newstr+str1+str2+" ";
    }
    System.out.println(newstr);
}
}