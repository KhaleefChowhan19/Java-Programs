package armstrongnumber;

public class ArmstrongNumber {
public void display(int num)
{
	long temp=num;
	long rem=0;
	long sum=0;
	for(int i=1;num!=0;num=num/10)
	{
		rem=num%10;
		sum=sum+rem*rem*rem;
	}
	
	if(temp==sum)
	{
		System.out.println("it is a armstrong number");
	}
	else
	{
		System.out.println("it is not a armstrong number");
	}
	
}
}
