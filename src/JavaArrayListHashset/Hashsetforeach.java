package JavaArrayListHashset;

import java.util.HashSet;

public class Hashsetforeach {

	public static void main(String[] args) {
HashSet<String> list=new HashSet<String>();
 System.out.println(list.size());
 list.add("ABC");
 list.add("USA");
 list.add("UK");
 for(String str:list){
	 System.out.println(str);
 }
 
 list.remove("USA");
 for(String str:list){
	 System.out.println(str);
 }
 
	}

}
