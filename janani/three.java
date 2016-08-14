package janani;

public class three {
void multiple(int x){
	if(x%3==0){
		System.out.println("multiple of 3");
	}
	else{
		System.out.println("No!");
	}
	
}

public static void main (String args[]){
	
	three t=new three();
	t.multiple(1800);
}
}