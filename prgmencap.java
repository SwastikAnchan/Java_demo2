class encap
{
  private int SSN;
  private String name;
  private int Salary;
   
        public int getSSN()
		{
		   return (SSN);
		  
		}
         public void setSSN(int SSN)
        {
           this.SSN=SSN;
        }
          public String getname() 		
		{
           return(name);
        }
          public void setname(String name)
		{
	        this.name=name;
	    }
		 public void setSalary(int Salary)
		{
			this.Salary=Salary;
		}
		 public int getSalary()
		{
            return(Salary);
        }
}
class prgmencap
{
public static void main(String args[])
{
   encap E1=new encap();
   E1.setSSN(60);
   E1.setname("Swastik");
   E1.setSalary(120000);
   System.out.println("SSN="+E1.getSSN());
   System.out.println("name="+E1.getname());
   System.out.println("salary="+E1.getSalary());	
}
}		 