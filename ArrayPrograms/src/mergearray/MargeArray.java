package mergearray;

import java.util.Scanner;

public class MargeArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no.of elements in first array");
		int size=scan.nextInt();
		int[]a=new int[size];
		System.out.println("enter the no.of elements in second array");
		int size1=scan.nextInt();
		int[]b=new int[size1];
		System.out.println("enter the elements in array 1");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("enter the elements in array 2");
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=scan.nextInt();
		}
		MargeArray1.display(a,b);


	}

}
