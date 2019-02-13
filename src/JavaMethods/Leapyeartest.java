package JavaMethods;

public class Leapyeartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int counter=0;
     for(int i=2001; i<2100; i++)
     {
    	if(isleapyear(i))
    			{
    	counter++;
    	System.out.println(i +" "+"is Leap Year");}
    	else 
    		System.out.println(i+" "+ "is not leap year");
     }
     System.out.println(counter);
	}
  public static boolean isleapyear(int year){
	  boolean result=false;
	  if(year%400==0)
		  result=true;
	  else if ((year%4==0) && (year%100!=0))
		  result=true;
	  else
		  result=false;
	  return result;
  }
}
