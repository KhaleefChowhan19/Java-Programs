package largestdigitnumber;

public class LargestDigitNumber {
public void display(int num)
{
	
	int digit=0;
	int sum=0;
	for(int i=1;num!=0;num=num/10)
	{
		digit=num%10;
		if(digit>sum)
		{
			sum=digit;
		}
	}
		System.out.println("the largest digit is"+sum);
}
}
