
public class PrimeNumber1 {
public void display(int a)
{
	System.out.println("the prime numbers are :");
	int count=0;
	for(int i=1;i<=a;i++)
	{
		count=0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.print(i+" ");
		}
	}
}
}
