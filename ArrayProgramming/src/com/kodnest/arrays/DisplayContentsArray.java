package com.kodnest.arrays;
import java.util.Scanner;
public class DisplayContentsArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		int size=scan.nextInt();
		//creating an array
		int[]arr=new int[size];
		// storing the elements in array
		System.out.println("enter "+arr.length+"numbers to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		// Displaying the elements of array
		System.out.println("the numbers stored in the array are :");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
