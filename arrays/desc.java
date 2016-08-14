package arrays;

public class desc {
public void nee (int a[]){
	int z=0;
	for (int i=0; i<a.length; i++){
		for (int j=i+1; j<a.length; j++){
			if(a[i]<a[j]){
				z=a[j];
				a[j]=a[i];
				a[i]=z;	
				
			}
		}
	}
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);	
	}

}
public static void main(String af[])
{
int[] a= {62, 31, 10, 90};
	desc th=new desc();
th.nee(a);

}}