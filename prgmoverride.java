class first
{
	int a;
	first(int a)
	{
		this.a=a;
	}
void display()
	{
	System.out.println("Value of a in first"+a);
	}
}
class next extends first
{
	int b;
	next (int x, int b)
	{
		super(x);
		this.b=b;
	}
void display()          //method overriding
	{
	System.out.println("Value of b is"+b);
	}
}
class prgmoverride
{
	public static void main(String args[])
	{
		next objnext=new next(10,20);
		objnext.display();		//calling overriding
	}
}
	