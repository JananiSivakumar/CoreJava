package stringexample;

public class subs {
public void stri(String a){
	System.out.println(a.substring(3, 11));
	System.out.println(a.indexOf("a"));
	System.out.println(a.lastIndexOf("a"));
	System.out.println(a.concat(" is the email ID"));
	System.out.println(a.contentEquals(a.concat(" is the email ID")));
	//System.out.println(a.);
	}

public static void main(String args[]){
	subs m= new subs();
	m.stri("pradeep.janani@gmail.com");
}
}