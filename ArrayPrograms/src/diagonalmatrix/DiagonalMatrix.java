package diagonalmatrix;

import java.util.Scanner;

public class DiagonalMatrix {

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
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=arr.length-1;i++)
		{
		   sum1=sum1+arr[i][i];
		   sum2=sum2+arr[i][row-1-i];
			
		}
		System.out.println("the sum of daigonal matrix1 is"+sum1);
		System.out.println("the sum of daigona2 matrix1 is"+sum2);

	}



	}


