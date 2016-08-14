package arrays;

public class datatransfer {
int a[]=new int[10];
int b[]=new int[10];
void transfer() {
	for (int i=0;i<a.length ;i++)
	{
		a[i]=i;
		b[i]=a[i];
	}
	
	for (int i=0;i<a.length ;i++){
	System.out.println(a[i]);
	//System.out.println(b[i]);
	}
	System.out.println(a);//Prints the object value

}
public static void main(String args[]){
	datatransfer dt= new datatransfer();
	dt.transfer();
}
}
