package powernumber;

public class PowerNumber {
public void display(int base,int exponent)
{
	/*int power=1;
	for(int i=1;i<=exponent;--exponent)
	{
		power=power*base;
	}
	System.out.println("the power of the number is :"+power);*/
	int a=0;
	a=(int)Math.pow(base, exponent);
	System.out.println("the power of the number is "+a);
			
}
}
