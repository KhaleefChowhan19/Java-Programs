
public class Number {
public int display(int a)
{
	// checking the number is less than 0 its print it is a negative number
	if(a<0)
	{
		System.out.println("it is a negative number");
	}
	// checking the number is greater than 0 its print it is a positive number
	else if(a>0)
	{
		System.out.println("it is a positive number");
	}
	else
		//its print zero
	{
		System.out.println("zero");
	}
	return a;
}
}
