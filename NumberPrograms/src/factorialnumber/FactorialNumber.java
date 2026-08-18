package factorialnumber;

public class FactorialNumber {
public void display(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("the factorial number is "+fact);
}
}
