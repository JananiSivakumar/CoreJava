package Constructor;

public class program {
	String name;
	int number;
	static String colg="newjersey";
	program(String name,int number)
	{
	this.name=name;
	this.number=number;
	}
	program(String name,int number, String colg)
	{
	this.name=name;
	this.number=number;
	this.colg=colg;
	}
	void show()
	{
	System.out.println(name+"  "+number+"  "+colg);
	}
	public static void main(String af[])
	{
	program pg=new program("terror",50);
	program pg1=new program("paapu",60);
	pg.show();
	pg1.show();
	}
}
