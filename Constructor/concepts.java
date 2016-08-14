package Constructor;

public class concepts {
	static int a=15;
	int u;
	String g;
	int jj;
	concepts() {
		System.out.println("Constructor");
		a=21;
		System.out.println(a);
	}
	concepts(int u,String g){
		
		System.out.println(u + g);
		this.u=u;
		this.g=g;
		this.jj=u;
	}
void method(){
System.out.println("Hello World");
}
void method(int i){
System.out.println(i);	
}
void display()
{
	System.out.println(u+g+jj);
}
public static void main(String af[]){
concepts j=new concepts();
concepts k=new concepts(28,"jose");
j.method();
j.method(3);
k.display();
j.display();
System.out.println(a);
}}