package arrays;

public class missing {
int a[]=new int[700];
int b[]=new int[700];
void found (){
	for (int i=0;i<a.length ;i++)
	{
		a[i]=i;
		b[i]=a[i];
	}
	
	b[223]=0;
	int suma=0;
	int sumb=0;
	for(int i=0;i<a.length ;i++){

	suma=suma+a[i];
	sumb=sumb+b[i];
	}
	int c=suma - sumb;
	System.out.println("Number missing is " + c);
	
}

public static void main(String args[]){
	missing m= new missing();
	m.found();
}
}