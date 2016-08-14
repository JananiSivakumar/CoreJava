package Constructor;

public class examples {
	int number;
	String name;
	examples(int number,String name)
	{
	this.number =number;                          
	this.name=name;
	System.out.println("Executed this constructor");
	}
   void display()
	{
	System.out.println(this.number+"  "+this.name);
	}
	public static void main(String aaa[])
	{
	examples obj=new examples(15,"eggie");
	examples obj1 = new examples(17, "Rima");
	obj.display();
	obj1.display();
	}
}
