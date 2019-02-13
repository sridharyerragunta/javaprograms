package JavaArrayListHashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicatenum {

	public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>();

    list.add(100);
    list.add(200);
    list.add(300);
    list.add(200);
    list.add(400);
    list.add(200);
    
    System.out.println(list.size());
    list.remove(2);
    HashSet<Integer> set=new HashSet<Integer>();
    set.addAll(list);
    set.add(700);
    set.add(800);
    System.out.println(set.size());
    for(int i:set){
    	System.out.println(i);
    }
    set.remove(800);
    for(int i:set){
    	System.out.println(i);
    }
	}

}
