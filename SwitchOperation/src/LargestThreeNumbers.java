
public class LargestThreeNumbers {
public int display(int a,int b,int c)
{
	if(a==b &&b==c)
	{
		System.out.println("all are eual");
	}
	else if(a>b&&b>c)
	{
		System.out.println("largest number");
	}
	else
	{
	System.out.println("largest number"+c);	
	}
	return a;
}
}
