package Inheritance;

public class inheritaceTest {
	public static void main(String a[])
	{
		man m=new man();
		System.out.println("man's leg is "+ m.getLeg());
		System.out.println("man's wing is "+m.getWings());
	 m.getMilk();
		birds b=new birds();
		System.out.println("Birds leg is "+b.getLeg());
		System.out.println("Birds wing is "+b.getWings());
		
		rabbit r=new rabbit();
		System.out.println("Rabbit has these many legs " +r.getLeg());
	
		crow c=new crow();
		c.getBeak();
		System.out.println(c.getLeg());
		b.getBeak();;
	}
}
