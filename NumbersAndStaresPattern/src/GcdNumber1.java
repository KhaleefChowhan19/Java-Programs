
public class GcdNumber1 {
public void display(int a, int b)
{
	int gcd=1;
	for( int i=1;i<=a&&i<=b;i++)
	{
		if(a%i==0&&b%i==0)
		{
			gcd=i;
		}
	}
	System.out.println(gcd);
	int lcm=(a*b)/gcd;
	System.out.println("the lcm is"+lcm);
}
}
