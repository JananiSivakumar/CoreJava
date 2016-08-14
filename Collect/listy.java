package Collect;

import java.util.ArrayList;
import java.util.Arrays;



public class listy {
void lis(){
	ArrayList<String> a = new ArrayList<String>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	//String[] b = new String[6];
a.add("1");
a.add("40");
a.add("124");
a.add("8393");

a.add("1");
System.out.println(a.size());
System.out.println(a);
System.out.println(a.get(3));
System.out.println(a.remove(2));
System.out.println(a);

/*a.toArray(b);

for (int i=0;i<b.length ;i++){
	System.out.println(b[i]);
	}
a.add(2, "34579");
System.out.println(a);
ArrayList <String> e = (ArrayList) Arrays.asList(b);*/

}
public static void main(String args[]){
listy m= new listy();
	m.lis();
}
}
