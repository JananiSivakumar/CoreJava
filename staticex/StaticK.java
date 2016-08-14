package staticex;

public class StaticK {
	static int a=90;
	void display()
	{
	System.out.println("Hello terror");
	int a=100;
	System.out.println(a); 
	
	}
	static void age(int age)
	{
	if(age>18)
	System.out.println("vote");
	else
	System.out.println("not permitted");
	}
	public static void main(String af[])
	{
	StaticK note=new StaticK();
	age(45); //Static method does not need an object to call it
	note.display();
	System.out.println(StaticK.a);
	
	}
}
