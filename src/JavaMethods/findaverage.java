package JavaMethods;

public class findaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int result=sumavg(50,50,49);
    if (result>70)
    	System.out.println("grade1");
    else if (result>=50) System.out.println("GradeII");
    else System.out.println("GradeIII");
    
	}
public static int sumavg(int a, int b, int c){
	
	int avg=0;
	avg=(a+b+c)/3;
	return avg;
}
}
