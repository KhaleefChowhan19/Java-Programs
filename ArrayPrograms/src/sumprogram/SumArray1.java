package sumprogram;
import java.util.Scanner;
public class SumArray1 {
public static void display(int[]arr)
{
	
	System.out.println("the sum of the all elements are :");
	int sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=sum+arr[i];
		
	}
	System.out.println(sum);
}
}
