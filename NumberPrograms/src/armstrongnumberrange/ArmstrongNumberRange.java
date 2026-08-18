package armstrongnumberrange;

public class ArmstrongNumberRange {
public void display(int num)
{
	long n=0;
	long rem=0;
	long sum=0;
	for(int i=1;i<=num;i++)
	{
		n=num;
		while(n>0)
		{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;
		}
	
	if(sum==i)
	{
		System.out.println("armstrong number"+i);
	}
	sum=0;
	
	}
	}
	
}

