package arrays;


public class sorting {
	public void sor (int[] a){
		try{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					int temp=0;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
					}
			}
			
		}
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}}
		catch(Exception e){
			System.out.println("exception!!");
		}
	}
 
	public static void main(String af[])
	{
	int[] b= {42, 12, 56, 80,37};
		sorting th=new sorting();
	th.sor(b);
	}

	}

