package except;
import java.io.IOException;

public class trycatchfin {
	String s="Exception Janani";
	
public void hello() throws IOException{//IOException is checked/unhandled exception, needs to have try/catch block in that case

	try { // every try block can essentially have only one throw statement
	throw new ArrayIndexOutOfBoundsException(s);// throw new is the syntax keywords to throw an exception; s is the message, so this exception is throwing an object by itself 
		
		//throw new ArrayIndexOutOfBoundsException();

//throw new ArrayStoreException();//After throw statement catch block is executed, all code below throw will not be executed

	//System.out.println("Executing try block");
	}
	
	catch(ArrayIndexOutOfBoundsException e){ //e is exception object
		String a=e.getMessage();//getmessage method will get the message(usually in string format) from exception object
		//e.getStackTrace();//Most often used to find errors
		System.out.println(e.getStackTrace());
		System.out.println(a);
		System.out.println("catch block for ArrayOutOfBoundException");
	

	}
	catch(ArrayStoreException f){
	System.out.println("catch block for ArrayStoreException");	
		
	}
	catch(IllegalArgumentException i){
		System.out.println("catch block for illegal argument");
	}
	finally{
		System.out.println("Fnally block executed");

	}
	
	
}


public static void main(String af[])
{
	trycatchfin tr=new trycatchfin();
	try {
		tr.hello();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
