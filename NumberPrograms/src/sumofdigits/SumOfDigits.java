package sumofdigits;

public class SumOfDigits {
public void display(int num)
{
	long sum=0;
	long digit=0;
	for(int i=1;num!=0;num=num/10)
	{
		digit=num%10;
		sum=sum+digit;	
    }
	System.out.println("sum of digits :"+sum);
	
}
}
