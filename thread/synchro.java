package thread;

public class synchro extends Thread {
	PrintDemo pd; // Creating a variable but not initializing i.e. not creating a new object
	private String name;
	synchro(String s, PrintDemo dp){
		name=s;
		pd=dp;
		System.out.println("Creating "+ name);
	}
public void run(){
	synchronized(pd){//to make sure that only one thread can access the object pd at a given time and second object should wait
		pd.printCount();
	}
	System.out.println("Exiting " +name);
}
public static void main(String af[])
{
	PrintDemo dp=new PrintDemo();
synchro th=new synchro("Thread1", dp);
th.start();
synchro th1=new synchro("Thread2", dp);
th1.start();
}

}
