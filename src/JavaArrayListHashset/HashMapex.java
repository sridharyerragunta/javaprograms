package JavaArrayListHashset;

import java.util.HashMap;
import java.util.Set;

public class HashMapex {

	public static void main(String[] args) {
    HashMap<Integer, String> map=new HashMap<Integer, String>();
    map.put(101, "Hello");
    map.put(102, "Fruit");
    map.put(103, "India");
    map.put(104, "USA");
    map.put(105, "Pets");
    System.out.println(map.size());
    System.out.println(map.get(103));
    
         Set<Integer> set1= map.keySet();
         for(int in:set1){
        	 System.out.println(in+"-->"+map.get(in));
         }
    
    HashMap<Integer, String[]> map1=new HashMap<Integer, String[]>();
    String[] countries1={"India","Australia", "UK", "USA"};
    String[] countries2={"Hello","Dogs", "Chocklets", "Fruits"};
    map1.put(200, countries1);
    map1.put(300, countries2);
   
       Set<Integer> set= map1.keySet();
       
       for(int i:set){
    	   System.out.println(i+"-->"+map1.get(i));
       }
       
	}

}
