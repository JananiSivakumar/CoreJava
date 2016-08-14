package stringexample;

public class emailv {
	public boolean emo (String email) {
		boolean a = true;
		int c=0;
		int k = email.lastIndexOf(".");
		int l = email.indexOf("@");
		
		if (l==-1||k==-1){
			System.out.println("No @ or .");
			a=false;//execution stops at return
		}
		if (k<l){
			System.out.println("@ and . are not at right positions");
			a=false;

		}
		
		for(int i=0;i<email.length(); i++){
			if(email.charAt(i)=='@'){
			c++;
			}
			
	}
		if (c>1){
			a= false;
		
		System.out.println("Has more than one @");
		}
		System.out.println("VALID EMAIL ID");
		return a;
}
	public static void main(String args[]){
		String s = "djfndfmsfnsm@nfmsd.com" ;
		emailv m= new emailv();
		System.out.println(m.emo(s));
		
	}
	}

