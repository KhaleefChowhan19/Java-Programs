
public class Age {
public int display(int a)
{
	if(a>=0 && a<=12)
	{
		System.out.println("child");
	}
	else if(a>=13 && a<=19)
	{
		System.out.println("teen");
	}
	else if(a>=20&&a<=59)
	{
		System.out.println("adult");
	}
	else
	{
		System.out.println("senior");
	}
	return a;
}
}
