
public class SumOfDigits1 {
public void display(int a)
{
	
	long sum=0;
	long digit=0;
	for(int i;a!=0;a=a/10)
	{
		digit=a%10;
		sum=sum+digit;	
    }
	System.out.println("sum of digits :"+sum);
 }
}