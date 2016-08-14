package Constructor;

public class superChildCon extends superCon{
	
	superChildCon(int x){
	
		super(6);
		System.out.println("this is child class constructor with param");
	}
	superChildCon(){
		super();
		System.out.println("this is child class constructor without param");
	}

	public static void main(String[] args) {
		
		superChildCon scc = new superChildCon(7);
		superChildCon scd = new superChildCon();
	}

}
