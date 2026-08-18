package palindrome;

public class PalindromeNumber {
public void display(int num)
{
	long temp=num;
	long rem=0;
	long rev=0;
	/*for(int i=1;num!=0;num=num/10)
	{
		rem=num%10;
		rev=rev*10+rem;
	}
	
	if(temp==rev)
	{
		System.out.println("it is a palindrome number");
	}
	else
	{
		System.out.println("it is not a palindrome number");
	}*/
	while(num>0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(temp==rev)
	{
		System.out.println("it is a palindrome number");
	}
	else
	{
		System.out.println("it is not a palindrome number");
	}
}
}
