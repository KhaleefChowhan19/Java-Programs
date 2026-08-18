package evennumber;

public class EvenNumbers {
public void display(int num)
{
	for(int i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
	}
}
}
