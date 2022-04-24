package Pack1;

public class ArmostrongNumber

{

	public static void main(String[] args) 
	{
		
	  int num=153,temp=num,rev=0,val,sum=0;
	  while(!(num==0))
	  {
	  rev=num%10;
      val=rev*rev*rev;  
      sum=sum+val;
    //System.out.println(sum);
      num=num/10;
	  }
	  num=temp;
	  //System.out.println(num);
      if(num==sum)
      {
    	  System.out.println("armostront number");
      }
      else
      {
    	  System.out.println("not armostrong");
      }
	}

}
