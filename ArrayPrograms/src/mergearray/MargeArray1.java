package mergearray;

public class MargeArray1 {
public static void display(int[]a,int[]b)
{
	int fal=a.length;
	int sal=b.length;
	int reslength=fal+sal;
	int[]result=new int[reslength];
	
	for(int i=0;i<=a.length-1;i++)
	{
		result[i]=a[i];
	}
	for(int i=0;i<=b.length-1;i++)
	{
	result[a.length+i]=b[i];
	}
	System.out.println("the marging array is");
	for(int i=0;i<=reslength-1;i++)
	{
		System.out.println(result[i]);
	}
}
}
