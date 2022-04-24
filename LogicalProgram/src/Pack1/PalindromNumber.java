package Pack1;

public class PalindromNumber 
{
	int num=4321;
	int rem,val;
	void meth1() 
	{
	while(!(num==0))
	{
       rem=num%10; 
       System.out.print(rem);
       num=num/10;
	}
	}
	public static void main(String[] args)
	{
        new PalindromNumber().meth1();
	}

}
