package largestdigitnumber;

import java.util.Scanner;

import sumofsquarenumber.SumOfSquareNumber;

public class LargestDigitNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		LargestDigitNumber ch=new LargestDigitNumber();
		ch.display(num);
	}

}
