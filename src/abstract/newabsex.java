package abstracts;

public class newabsex extends absex {
	public void methabs2()//abstract method must be defined in the inherited class
	{
		System.out.println("Defined the abstract method");
	}
	
	public static void main(String[] args) {

//absex ab=new absex(); - cannot instantiate an abstract class using an object
newabsex cd=new newabsex();
cd.methabs1();//non-abstract method can be called directly, no need to define
cd.methabs2();
	}


}
