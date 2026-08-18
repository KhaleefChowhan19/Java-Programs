package com.kodnest.arrays;
import java.util.Scanner;
public class LinearSearch1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int[]arr=new int[scan.nextInt()];
		System.out.println("enter"+arr.length+"numbers to be searched");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key to be searched");
		int key=scan.nextInt();
		System.out.println(Search.linearSearch(arr,key));
	}

}
