package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Collect.listfunc;

public class sortlist {
public void arr() {
	ArrayList<String> d = new ArrayList<String>();
	d.add("Prad");
	d.add("Jana");
	d.add("Rima");
	d.add("Zee");
	d.add("Vija");
	System.out.println(d);
	Collections.sort(d);//sort an arraylist
	System.out.println(d);
	Collections.sort(d, Collections.reverseOrder());//Reverse sort an arraylist
	System.out.println(d);
}

public void arra() {
	ArrayList<Integer> d = new ArrayList<Integer>();
	d.add(100);
	d.add(1);
	d.add(137);
	d.add(9897);
	d.add(25);
	System.out.println(d);
	Collections.sort(d);
	System.out.println(d);
	List<Integer> y = d.subList(1, 3);//sublist uses class 'List' and not ArrayList
	System.out.println(y);
	Object[] o = d.toArray();//Convert arraylist to array
	for (int i=0; i<o.length; i++) {
		System.out.println(o[i]);
	}
	
}
public static void main(String args[]){
	sortlist m= new sortlist();
		m.arr();
		m.arra();
	}
	}

