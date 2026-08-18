package copyarray;

import java.util.Scanner;

public class CoppyArray {

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
		CoppyArray1.display(arr);

	}

}
