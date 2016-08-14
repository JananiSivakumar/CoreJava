package except;

public class difference {
	 
	public void something() throws ArrayIndexOutOfBoundsException {//throws signifies that this method will possibly throw this exception
		String s[]=new String[4];
		s[0]="Janani";
		s[1]="Pradeep";
		s[2]="Jaisimha";
		s[3]="Rima";

			

	
			for(int i=3;i<s.length;i--)
			{
				System.out.println(s[i]);	
				}	
			}
		
		
	

	public static void main(String af[])
	{
difference di=new difference();
di.something();
	}
}