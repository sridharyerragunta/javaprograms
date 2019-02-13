package javaStrings;

public class StrDemo7 {

	public static void main(String[] args) {
    String str="Swetha Nellikuduru";
    String revstr="";
//    StringBuilder s=new StringBuilder(str);
//    System.out.println(s.reverse());
    for(int i=str.length()-1;i>=0;i--){
    	 revstr = revstr+str.charAt(i);
    	
    }
    System.out.println(revstr);
    }
	}


