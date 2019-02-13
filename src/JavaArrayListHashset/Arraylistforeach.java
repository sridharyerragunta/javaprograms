package JavaArrayListHashset;

import java.util.ArrayList;

public class Arraylistforeach {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		System.out.println(list.size());
		list.add("TCS");
		list.add("HONEYWELL");
		System.out.println(list.size());
		list.add("Accenture");
		for(String str:list){
			System.out.println(str);
		}

	}

}
