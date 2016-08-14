package janani;

class looptester {

void recparam(int a){
	if(a==1){
		System.out.println("Value of a is 1");
	}
	else if(a==2){
	System.out.println("Value of a is 2");
	}
	else if(a==3){
		System.out.println("Value of a is 3");	
	
	}
	else {
		System.out.println("Bad Luck");
	}
	//else if (a>3){
		//System.out.println("Bad luck");
	//}
}


public static void main (String args[]){
	
	looptester l=new looptester();
	l.recparam(2);
}
}