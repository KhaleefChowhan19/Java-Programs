package sumprogram;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int size=scan.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		SumArray1.display(arr);
		/*System.out.println("the sum of the all elements are :");
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);*/
	}

}
