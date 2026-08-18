package checkarray;
import java.util.Scanner;
public class CheckArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no.of elements");
		int size=scan.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter element to be searched");
		int a=scan.nextInt();
		int res=CheckArray1.display(arr,a);
		if(res==-1)
		{
			System.out.println("element is not found");
		}
		else
		{
			System.out.println("element is found"+res);
		}
	}

}
