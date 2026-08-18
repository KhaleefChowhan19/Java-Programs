package com.kodnest.arrays;
import java.util.Scanner;
public class SwapTheNumbers {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first number");
	int num1=scan.nextInt();
	System.out.println("enter the second number");
	int num2=scan.nextInt();
	System.out.print("before swaping"+num1+" "+num2);
	System.out.println();
	int res=0;
	res=num1;
	num1=num2;
	num2=res;
	System.out.print("after swaping"+num1+" "+num2);
	}

}
