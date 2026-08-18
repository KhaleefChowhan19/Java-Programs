package summatrix;

import java.util.Scanner;

public class Sum2DMatrix {

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

		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			sum=sum+arr[i][j];	
			}
			
		}
		System.out.println("the sum of the matrix is"+sum);

	}

}
