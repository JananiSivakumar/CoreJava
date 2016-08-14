package arrays;

public class dupe {

	  void comm(int a[])
	    {
	 
	        for(int i = 0; i < a.length; i++)
	        {
	            for(int j = i+1; j < a.length; j++)
	            {
	                if(a[i] == a[j]) 
	                {
	                  System.out.println(a[j]);  
	                }
	               }
	            }
	        }
	        public static void main(String args[]){
        	int a[] = {22, 36, 40, 36, 22};
	            	dupe dt= new dupe();
	            	dt.comm(a);
}
}