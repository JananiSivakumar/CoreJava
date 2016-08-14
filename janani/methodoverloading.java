package janani;

public class methodoverloading {
	public int add(int a,int b)
	{
	int c=a+b;
	return c;
	}
	public float add(float c,float d)
	{
	float e=c+d;
	return e;
	}
	public String add( String s1,String s2)
	{
	return s1+s2;
	}
	public static void main(String args[])
	{
	methodoverloading ad=new methodoverloading();
	int a=ad.add(10,30);//Method overloading calls methods with same name but with diff parameters, will happen in same class 
	float b=ad.add(23.6f,98.2f);
	String c=ad.add("PUP","EGG");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
