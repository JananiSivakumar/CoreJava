package thread;


public class newthread extends Thread {
	
public void run() {
System.out.println("This thread is running");
}


public static void main(String af[])
{
newthread th=new newthread();
th.start();
}

}