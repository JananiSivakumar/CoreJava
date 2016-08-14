package janani;

public class swap {
	
	int d;
	
public void swit(){
	int a=10;
	int b=20;
	int temp=30;// or int temp; is also fine
temp=a;
System.out.println(a);
System.out.println(temp);
a=b;
System.out.println(a);
System.out.println(b);
b=temp;
System.out.println(a);
System.out.println(b);

System.out.println(d);
System.out.println(temp);

}
public static void main(String[] args) {
	
	
	swap obj = new swap();
	obj.swit();
}}