package arrays;

public class complex {
public void remove (int[] a){
	
	int m=a[(a.length)/2];
	System.out.println("Middle element is "+m);
	
	for (int i=(a.length)/2; i<a.length; i++){
		if(i<(a.length)-1){
		a[i]=a[i+1];
			a[i+1]=0;
			}
	
	}
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
}
public static void main(String af[])
{
int[] a= {62, 31, 10, 90, 72, 7, 56};
	complex th=new complex();
th.remove(a);

}}

