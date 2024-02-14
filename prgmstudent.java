class student
{
	int rollno;
	String name;
public void setdata(int r,String n)
	{
		
		name=n;
		rollno=r;
	}
public void display()
	{
		System.out.println("Name is ="+name);
		System.out.println("roll no is="+rollno);
	}
}

class prgmstudent
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.setdata(60,"Swastik");
		s1.display();
	}
}
