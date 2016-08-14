package Constructor;

public class thisCon {
	thisCon(){
		this(6);//this calls the constructor with an argument
		System.out.println("Hi this is constructor without arguments");
	}
	
	thisCon(int a){
		//this();//this calls the constructor(with same name) with no arguments
	System.out.println("this is constructor with arguments-->"+a);
		
	}
	

	public static void main(String[] args) {
		thisCon tc=new thisCon();

	}

}
