package fibonaccinumber;

public class FibnacciNumber {
	public void display(int num)
	{
	int fib1=0,fib2=1;
	int count = 0,fib3;
	if(count==1)
	{
		System.out.println("fib1");
	}
	else if(count==2)
	{
		System.out.println(fib1+" "+fib2);
	}
	else
	{
		for(int i=3;i<=num;i++)
		{
			System.out.println(fib1+" "+fib2+" ");
			fib3=fib1+fib2;
			System.out.println(fib3+" ");
			fib1=fib2;
			fib2=fib3;
		}
	}
}
}
