package addarray;
import java.util.Scanner;
public class AddArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the no.of elements in array 1");
	int size=scan.nextInt();
	int[]a=new int[size];
	System.out.println("enter the no.of elements in array 2");
	int size1=scan.nextInt();
	int[]b=new int[size1];
	System.out.println("enter the elements in array1");
	for(int i=0;i<=a.length-1;i++ )
	{
		a[i]=scan.nextInt();
	}
	System.out.println("enter the elements in array2");
	for(int i=0;i<=b.length-1;i++)
	{
		b[i]=scan.nextInt();
	}
	int[]c=new int[size];
	System.out.println("the sum of array is:");
	for(int i=0;i<=a.length-1;i++)
	{
		c[i]=a[i]+b[i];	
		 System.out.println(c[i]);
	}

	}
    
}

