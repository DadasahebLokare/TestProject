package Pack1;

public class Fibonacci
{
	void meth1()
	{
	 int num1=0,num2=1,val;
	 System.out.println(num1);
	 System.out.println(num2);
      for(int i=1;i<=10;i++)
      {
    	 
    	  val=num1+num2;
    	  System.out.println(val);
    	  num1=num2;
    	  num2=val;
    	  
      }
	}
	public static void main(String[] args)
	{
	  new Fibonacci().meth1();	
	}

}
