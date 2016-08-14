package interfaces;

public class clasinter implements exinter {
public void method1()
{
System.out.println("1st method");	
}

public void method2(){
	System.out.println("2nd method");
}	

public static void main(String[] args) {
	
clasinter clin=new clasinter();
clin.method1();
clin.method2();
}


}