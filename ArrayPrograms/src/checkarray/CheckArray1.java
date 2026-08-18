package checkarray;

public class CheckArray1 {
public static int display(int[]arr,int a)
{
	for(int i=0;i<=arr.length-1;i++)
	{
		if(a==arr[i])
		{
			return i;		}
	}
	
	return-1;
	}
}
