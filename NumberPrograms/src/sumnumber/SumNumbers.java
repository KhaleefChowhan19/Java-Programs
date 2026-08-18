package sumnumber;

public class SumNumbers {
public void display(int num)
{
	int sum=0;
	for(int i=1;i<=num;i++)
	{
		sum=sum+i;
	}
	System.out.println("the sum of the numbers is "+sum);
}
}
