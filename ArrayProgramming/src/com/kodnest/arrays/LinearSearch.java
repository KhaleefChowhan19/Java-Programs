package com.kodnest.arrays;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =scan.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the"+(size)+" elements in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the element tobe search");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
		if(key==arr[i])
		{
			System.out.println("key element can be found index :"+i);
			System.exit(0);
		}
		
		}
		System.out.println("key element can not be found");
	}

}
