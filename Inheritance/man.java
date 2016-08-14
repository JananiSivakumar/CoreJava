package Inheritance;

public class man extends mammal{
int leg=2;
int wings=3;
int getLeg()
{
	return(leg);	
}
int getWings()//method overriding calls same method but performs different functionality inside that method, happens in different classes(inheritance)
{
	return(super.wings);//super.variablenameinsuperclass
}
}