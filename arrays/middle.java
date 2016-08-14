package arrays;

public class middle {
	String s ;
public void element (String[] a){
	for (int i=0; i<=(a.length)/2; i++){
		s = a[i];
		
	}
	System.out.println(s);

}

public void simple(String[] b) {
	
	System.out.println(b[(b.length)/2]);

}

public void change(String[] c) {
	/*System.out.println(c.length);
	c[(c.length)-1]="z";
	System.out.println(c[(c.length)-1]);*/
	
	for (int i=0; i<=c.length; i++){
		if (i==c.length){
			//c[(c.length)-1]= "sivakumar";
			System.out.println(c[(c.length)-1]="sivakumar");
			for (i =0; i<c.length; i++){
				System.out.println(c[i]);
			
		}
		
		}
	System.out.println(c[(c.length)-1]);
	
	}
	}

public void repmid(String[] d){
	
	for (int i=0; i<=(d.length)/2; i++){
	if (i==(d.length)/2){
		d[i]="helo";
		System.out.println(d[i]);
	}
	}
	for (int i =0; i<d.length; i++){
		System.out.println(d[i]);}
}
	


public static void main(String af[])
{
String[] a= {"a", "b", "jan", "gol", "chi"};
	middle th=new middle();
th.element(a);
th.simple(a);
th.change(a);
th.repmid(a);
}

}

