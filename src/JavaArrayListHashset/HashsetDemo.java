package JavaArrayListHashset;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
  HashSet<String> list=new HashSet<String>();
  System.out.println(list.size());
  list.add("India");
  list.add("USA");
  list.add("UK");
  list.add("Singapore");
  System.out.println(list.size());
  list.remove("UK");
  list.remove("Singapore");
  System.out.println(list.size());
  
	}

}
