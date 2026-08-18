package copyarray;

public class CoppyArray1 {
public static void display(int[]arr)
{
	int[]b=new int[arr.length];
	for(int i=0;i<=arr.length-1;i++)
	{
		b[i]=arr[i];
	}
	System.out.println("the copied array is :");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(b[i]);
	}
}
}
