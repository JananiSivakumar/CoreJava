package stringexample;

public class vowel {
	 int counter (String word){
		int w=0;
		for(int i=0;i<word.length(); i++){
			if (word.charAt(i)=='a'){
				w=w+1;
			}
					if (word.charAt(i)=='e'){
						w=w+1;	
			}
					if (word.charAt(i)=='i'){
						w=w+1;	
			}
					if (word.charAt(i)=='o'){
						w=w+1;	
			}
					if (word.charAt(i)=='u'){
						w=w+1;	
			}
		}
		return w;
	}
	 
	 int counter2(String word){
		 int w=0;
			for(int i=0;i<word.length(); i++){
				char s=word.charAt(i);
				if (s=='e'||s=='a'||s=='i'||s=='o'||s=='u'){
					w++;
				}
			}
		 return w;
	 }

	public static void main(String args[]){
		vowel m= new vowel();
		System.out.println(m.counter("pradeepjaisimha"));
		System.out.println(m.counter2("pradeepjaisimha"));
	}
	}
