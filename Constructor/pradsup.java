package Constructor;

public class pradsup {
	pradsup(){
		System.out.println("Constructor inside super class");
	}

	pradsup(int a){
		this();
		System.out.println("magic");
		
	}

}
