class Nareshit
{
static int x;
void increment()
{
	x++;
}
}
		class HydDemo
		{
	public static void main(String args[]) 
	{
		Nareshit obj1 = new Nareshit() ;
		Nareshit obj2 = new Nareshit();
obj1.x=0; 
obj1.increment();
obj2.increment();

System.out.println(obj1.x+" "+obj2.x);
	}
}