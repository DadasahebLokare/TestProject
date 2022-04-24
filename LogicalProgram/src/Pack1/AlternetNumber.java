package Pack1;
import java.util.*;
public class AlternetNumber {

	public static void main(String[] args) 
	{
		new ClassA();
	}

}
  class ClassA
  {
	  ClassA()
	  {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The First Number");
		 int a=sc.nextInt();
		 System.out.println("Enter The Secound Number");
		 int b=sc.nextInt();
		 System.out.println("Your Enter Value"+" a==> "+a+" b==> "+b);
		 a=a+b;//30
		 b=a-b;//30-20
		 a=a-b;//30-10
		 System.out.println("Reverse Number"+" a==> "+a+" b==> "+b);
	  }
  }