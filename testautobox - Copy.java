class testautobox
{
	public static void main(String args[])
	{
		byte a=10;
		short s=20;
		int i=30;
		long l=40;
	Byte objA=a;		//autoboxing
	Short objS=s;		//autoboxing
	Integer objI=i;		//autoboxing
	Long objL=l;		//autoboxing

System.out.println("Converted byte  value is="+objA);
System.out.println("Converted short  value is="+objS);
System.out.println("Converted integer value is="+objI);
System.out.println("Converted Long  value is="+objL);
	}
}

