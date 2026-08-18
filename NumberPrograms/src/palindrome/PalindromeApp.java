package palindrome;

import java.util.Scanner;

import sumofdigits.SumOfDigits;

public class PalindromeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		PalindromeNumber ch=new PalindromeNumber();
		ch.display(num);


	}

}
