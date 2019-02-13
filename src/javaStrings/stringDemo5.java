package javaStrings;

public class stringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String date="19-Feb-2020";
  String strArr[]=date.split("-");
//  for(int i=0;i<strArr.length;i++){
//	  System.out.println(strArr[i]);
//  }
  isLeapyear(Integer.parseInt(strArr[2]));
	}
  public static void isLeapyear(int year){
	  if(year%400==0)
			System.out.println("LY");
		else if((year%4==0)&&(year%100!=0))
			System.out.println("LY");
		else
			System.out.println("NLY"); 
  }
}
