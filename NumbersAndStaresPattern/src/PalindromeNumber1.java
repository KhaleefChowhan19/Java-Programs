
public class PalindromeNumber1 {
public void display(int a)
{
	int temp=a;
	int rem=0;
	int rev=0;
	for(int i=1;a!=0;a=a/10)
	{
		rem=a%10;
		rev=rev*10+rem;
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
