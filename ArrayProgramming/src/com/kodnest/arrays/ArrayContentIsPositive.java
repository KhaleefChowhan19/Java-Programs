package com.kodnest.arrays;
import java.util.Scanner;
public class ArrayContentIsPositive{

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
		// Displaying the elements of array by using enhanced for loop
		System.out.println("the positive numbers stored in the array are :");
		for(int x:arr)
		{
			if(x>0)
			{
				System.out.print(x+" ");
			}
		}
	}
}






