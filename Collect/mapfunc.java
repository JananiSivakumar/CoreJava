package Collect;

import java.util.HashMap;
import java.util.Map;

public class mapfunc {
void hmf(){
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	hmap.put(1, "Cali");
	hmap.put(2, "Utah");
	hmap.put(32, "Nevada");
	hmap.put(4, "NY");
	hmap.put(5, "Illiois");
	hmap.put(19, "Washington");
	hmap.put(10, "Florida");
	hmap.put(11, "Utah");
	hmap.put(12, "Oregon");
	System.out.println(hmap);
	System.out.println(hmap.clone());
	System.out.println(hmap.containsKey(32));
	System.out.println(hmap.containsKey(76));
	System.out.println(hmap.containsValue("Cali"));
	System.out.println(hmap.containsValue("Calif"));
	System.out.println(hmap.get(10));
	System.out.println(hmap.size());
	System.out.println(hmap.remove(4));
	System.out.println(hmap.remove(5, "Yayay"));
	System.out.println(hmap.replace(19, "Replace"));
	System.out.println(hmap);
	HashMap<Integer, String> newhmap = new HashMap<Integer, String>();
	hmap.putAll(newhmap);
	System.out.println("For Loop:");
    for (Map.Entry me : hmap.entrySet()) {//Iteration in HashMap
      System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
    }

	}
public static void main(String args[]){
	mapfunc m= new mapfunc();
	m.hmf();
}

}
