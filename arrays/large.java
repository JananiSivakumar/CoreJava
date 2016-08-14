package arrays;

public class large {
public void jan(int[] a) {

int m= 0;

for(int i=0; i<a.length; i++)
{
if (a[i]>m)
{
m=a[i];
}
}
System.out.println(m);
}

public void prad (int[]b){
	int n=0;
	for (int i=0; i<b.length; i++){
		for (int j=i+1; j<b.length; j++){
			if (b[i]<b[j]){
				n=b[j];
				}
			}
	}
	System.out.println(n);
}
public static void main(String af[])
{
int[] a= {4, 8, 10, 6};
	large th=new large();
th.jan(a);
th.prad(a);
}

}
