package twodmatrix;

import java.util.Scanner;

public class TwodMatrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row=scan.nextInt();
		System.out.println("enter the no.of columns");
		int col=scan.nextInt();
		int[][]arr=new int[row][col];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the element in row"+(i+1)+"column"+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("the matrix is");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
