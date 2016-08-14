package arrays;

public class remove {
void remele() {
	int a[]= {4, 5, 6, 7, 8};
	for(int i=2; i<a.length-1; i++){
		a[i]=a[i+1];
		
	}
	a[a.length-1]=0;
	for (int i=0;i<a.length ;i++){
		System.out.println(a[i]);
		
		}}
public static void main(String args[]){
	remove m= new remove();
	m.remele();
}
}
