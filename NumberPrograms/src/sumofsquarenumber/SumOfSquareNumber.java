package sumofsquarenumber;

public class SumOfSquareNumber {
public void display(int num)
{
	int sum=0;
	int square=0;
	for(int i=1;i<=num;i++)
	{
		square=i*i;
		sum=sum+square;
	}
	System.out.println("the first sum of square is"+sum);
}
}
