package staticex;

public class stvar {
static int a=90;//static variable value can be changed but not a good practice as static concept states that value is the same for all method or classes that access it
//static final int a=90; - when static variable is made final that value can never be changed

static int getInt(int x){
	return(a);
}

}
