package Collect;

import java.util.ArrayList;

public class looparrlist {
public void loop() {
	ArrayList<Integer> i = new ArrayList<>();
	i.add(11);
	i.add(324);
	i.add(32);
	i.add(8);
	i.add(45);
	i.add(71);
	i.add(11);
	i.add(3, 1020);
	System.out.println("For Loop");
    for (int j = 0; j < i.size();  j++) { 	//Iteration of arraylist	      
       System.out.println(i.get(j));   
	}
    
    System.out.println("---------------------------");
    
    for (int temp : i) {//Another method of Iteration of arraylist
        System.out.println(temp);
}
    System.out.println("Size is " + i.size());
    
    }
    public static void main(String args[]){
    	looparrlist m= new looparrlist();
    		m.loop();
    	}
    	}
