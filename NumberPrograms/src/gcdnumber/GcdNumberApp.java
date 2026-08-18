package gcdnumber;

import java.util.Scanner;

public class GcdNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("enter second number");
		int num2=scan.nextInt();
	GcdNumbers ch=new GcdNumbers();
		ch.display(num1,num2);


	}

}
