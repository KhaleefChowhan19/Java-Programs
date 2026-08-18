package primenumber;

public class PrimeNumbers {
public void display(int num)
{
	System.out.println("the prime numbers are :");
	int count=0;
	for(int i=1;i<=num;i++)
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
