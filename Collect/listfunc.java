package Collect;

import java.util.ArrayList;

public class listfunc {
public void exam() {
	ArrayList<String> t = new ArrayList<String>();
	ArrayList<String> u = new ArrayList<String>();
	System.out.println("Initial size " + t.size());
	t.add("Vijay");
	t.add("Karthik");
	t.add("Ramiish");
	t.add("Amudha");
	t.add("Golu");
	t.add("Ramiish");
	t.add("Rima");
	t.add("Golu");
	t.add("Siva");
	u.addAll(t);
	System.out.println(u);
	u.addAll(1,t);//addAll used to transfer elements of one arraylist to another
	System.out.println(u);

	int a= t.indexOf("Amudha");
	System.out.println(a);
	boolean b = t.contains("Pradeep");
	System.out.println(b);
	boolean c = t.contains("Vijay");
	System.out.println(c);
	System.out.println(t);
	System.out.println("Size after few additions " +t.size());
	for (int j = 0; j < t.size();  j++) { 		      
        System.out.println(t.get(j)); 
}
	System.out.println("------------------");
	for (String str:t){//Iterations of Arraylist
		System.out.println(str);
	}
	t.remove(7);
	t.remove(3);
	t.add(2, "Sowja");
	t.remove("Ramiish");
	System.out.println(t);
	System.out.println("Final size " +t.size());
	t.set(5, "Chitra");
	System.out.println(t);
	//t.clear();
	//System.out.println(t);
}
	
	 public static void main(String args[]){
	    	listfunc m= new listfunc();
	    		m.exam();
	    	}
	    	}
	

