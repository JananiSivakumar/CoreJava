package Collect;

import java.util.HashMap;


public class map {
	void globe (){

HashMap <String, String> m = new HashMap<String, String>();
HashMap <String, String> n = new HashMap<String, String>();

m.put("1", "Janani");
m.put("2", "Pradeep");
m.put("3", "Golu");
m.put("3", "Golu");
m.put("4", "Pradeep");
m.put("5", null);
m.put("6", null);
m.put(null, null);// HashMap will not accept null for both key-value
m.put(null, "girl");
m.put(null, "boy");//Replacing the value assigned to null,girl with boy as key is the same
System.out.println("HashMap permits single null key and any number of null values");
System.out.println(m);
System.out.println(m.get("1"));
System.out.println(m.values());
System.out.println(m.remove("3"));
System.out.println(m);
n=(HashMap)m.clone();
System.out.println(n);
System.out.println(m.clone());
System.out.println(m.containsValue("Jasimha"));
System.out.println(m.containsValue("Golu"));
System.out.println(m.containsValue("Janani"));
System.out.println(m.equals(n));
System.out.println(m.size());
System.out.println(m.replace("1", "Rima"));
System.out.println(m);


	}
	public static void main(String args[]){
		map m= new map();
		m.globe();
	}
}
