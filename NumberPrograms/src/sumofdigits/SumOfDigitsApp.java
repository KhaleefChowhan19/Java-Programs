package sumofdigits;

import java.util.Scanner;

import primenumber.PrimeNumbers;

public class SumOfDigitsApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		SumOfDigits ch=new SumOfDigits();
		ch.display(num);

	}

}
