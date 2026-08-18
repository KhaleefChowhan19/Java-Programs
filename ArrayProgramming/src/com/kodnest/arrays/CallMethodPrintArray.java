package com.kodnest.arrays;
import java.util.Scanner;
public class CallMethodPrintArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the elemnts in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		CallMethodPrintArray1.display(arr);

	}

}
