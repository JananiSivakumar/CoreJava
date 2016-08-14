package janani;


public class swapwith {
static void swa(int a, int b){
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
public static void main(String args[]){
	//swapwith w=new swapwith();
	swa(48,170);
}
}
