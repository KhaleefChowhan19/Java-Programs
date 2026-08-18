package com.kodnest.arrays;

import java.util.Scanner;

public class SwappingTheArray {

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
		System.out.println("before swapping the array are :");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("enter the first index to swap");
		int index1=scan.nextInt();
		System.out.println("enter the second index to swap");
		int index2=scan.nextInt();
		// Swap values at Specified index
		if(index1<0||index1>=size||index2<0||index2>=size)
		{
			System.out.println("invalid indices provided");
			return;
		}
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		System.out.println("after swapping the array are:");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		
	}

}

	


