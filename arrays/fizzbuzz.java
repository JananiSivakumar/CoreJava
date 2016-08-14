package arrays;



public class fizzbuzz {
public void jen (int[] a){
	for (int i=0; i<a.length; i++){
		if (a[i]%3 == 0 && a[i]%5 == 0){
			System.out.println("FizzBuzz");
	
		
	}
		else if(a[i]%3 == 0){
			System.out.println("Fizz");
		}
			else if (a[i]%5 ==0){
				System.out.println("Buzz");
			}}}
public static void main(String args[]){
	int[] b = {22, 50, 33, 31, 90, 99, 100, 101, 45};
	fizzbuzz m= new fizzbuzz();
	m.jen(b);
}
}