package thread;

class PrintDemo {
	   public void printCount(){
	    try {
	         for(int i = 1; i < 4; i++) {
	            System.out.println("Counter   ---   "  + i );
	         }
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	   }

	}