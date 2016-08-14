package stringexample;

import arrays.missing;

public class emailvalidator {
	boolean emailcheck (String email){
	boolean check = false;
	if(email!=null){

	int a=email.indexOf('@');
	int b=email.indexOf('.');
	if(a==-1||b==-1){
	return false;
	}
	int c=0;
	int d=0;
	check=true;
	for(int i=0;i<email.length(); i++){
	if(email.charAt(i)=='@'){
	c++;
	}
	if(c>1){
	check = false;
	}
	if(b<a){

	check=false;
	}
	}
	}
	return check;
	}
	public static void main(String args[]){
		emailvalidator m= new emailvalidator();
		System.out.println(m.emailcheck("joseiyer@gmail.com"));
	}
	}