package productofoddnumber;

public class OddNumbers {
	public void display(int num)
	{
   int count=1;
   for(int i=1;i<=num;i++)
{
	
	if(i%2!=0)
	{
		count=count*i;
		
		
	}
	
}
   System.out.print("the product of odd numbers is " +count);
}
}
