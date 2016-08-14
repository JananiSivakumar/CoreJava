package Collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class listtoset {
void lts() {
	ArrayList<Integer> i = new ArrayList<Integer>();
	i.add(11);
	i.add(324);
	i.add(32);
	i.add(8);
	i.add(45);
	i.add(71);
	i.add(11);
	System.out.println(i);
	System.out.println("----------------------------------------");
	HashSet<Integer> a = new HashSet<>(i);
	System.out.println(a);
	
}
public static void main(String args[]){
	listtoset m= new listtoset();
	m.lts();
}
}

