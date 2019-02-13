package JavaArrayListHashset;

public class foreachDemo1 {

	public static void main(String[] args) {
   int a[]={10,20,30,40,50};
   for(int i=0;i<a.length;i++){
	   System.out.println(a[i]);
   }
   System.out.println(">>>>>>>>>>>>>>>>>>");
	   
   for(int x:a){
	   System.out.println(x);
   }
   String[] names={"Sridhar","Mindq", "HONEYWELL","TCS"};
   for(String name:names){
	   System.out.println(name);
   }
	}

}
