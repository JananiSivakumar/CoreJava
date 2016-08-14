package arrays;

public class arrey {
	
	public static void main(String af[])
	{
	int a[]=new int[3];
	String s[]=new String[4];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	s[0]="Janani";
	s[1]="Pradeep";
	s[2]="Jaisimha";
	s[3]="Rima";
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
		System.out.println(s[0]+s[1]);//-concatenation
		
	}
	try{
		for(int i=3;i<s.length;i--)
		{
			System.out.println(s[i]);	
			//System.out.println(i);
		}
		
	
	}
	catch(ArrayIndexOutOfBoundsException e){//catch block is like a method execution
		System.out.println("Exception Caught");
		System.out.println(e);
	}
	
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
{
	System.out.println("array elements"+a[i]);
	}
	}
}
