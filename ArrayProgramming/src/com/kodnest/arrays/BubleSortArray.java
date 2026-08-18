package com.kodnest.arrays;
import java.util.Scanner;
public class BubleSortArray {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of aray");
	int size=scan.nextInt();
	int[]arr=new int[size];
	System.out.println("enter the elementes");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("before sorting the array is :");
	for(int x:arr)
	{
		System.out.print(x+" ");
	}

	}

}
