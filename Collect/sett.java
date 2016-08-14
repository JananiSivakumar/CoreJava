package Collect;

import java.util.HashSet;
import java.util.ArrayList;


public class sett {
	void sety(){
		HashSet<String> s = new HashSet<>();
		s.add("apple");
		s.add("mango");
		s.add("fig");
		s.add("kiwi");
		s.add("cantaloupe");
		s.add("honeydew");
		s.add("cherry");
		s.add("berry");
		s.add(null);
		s.add("berry");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains("joke"));
		System.out.println(s.contains("kiwi"));
		System.out.println(s.clone());
		System.out.println("---------------------------");
	
		 for (String temp : s) {//Iteration of hashset
		        System.out.println(temp);
	} 
		 //Iteration of HashSet can also be done through iterator hasNext() - 
		 System.out.println("---------------------------");
		 
		 System.out.println("---------------------------");
		 Object[] o = s.toArray();//Converting hashset to array
		 for (int i=0; i<o.length; i++) {
				System.out.println(o[i]);
			}
			
		 s.clear();
			System.out.println(s);
	}
	void numb(){
		HashSet<Integer> s = new HashSet<>();
		s.add(190);
		s.add(2);
		s.add(2323);
		s.add(78);
		s.add(4);
		s.add(398);
		s.add(43);
		System.out.println("HashSet contains: "+s);
		ArrayList<Integer> a = new ArrayList<Integer>(s);//converting hashset to arraylist
		System.out.println("ArrayList contains: "+ a);
	}
	public static void main(String args[]){
		sett m= new sett();
			m.sety();
			m.numb();
		}
}
