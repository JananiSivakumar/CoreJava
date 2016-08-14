package thread;

public class twothread extends Thread {
	
	private String name;
	
	twothread(String s){
		name=s;
		System.out.println("Creating "+ name);
	}
public void run() {
	try{
		for(int i=1;i<4;i++)	{
			System.out.println(name+ "," +i +" time");
			Thread.sleep(50);	
	}
	}
	catch(InterruptedException e){//to handle the exception encountered during Thread.sleep
		System.out.println("Exception " +e);
}
	

}

public static void main(String af[])
{
twothread th=new twothread("Pradeep");
th.start();
twothread th1=new twothread("Janani");
th1.start();
}

}

