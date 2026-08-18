package sumofsquarenumber;

import java.util.Scanner;

import palindrome.PalindromeNumber;

public class SumOfSquareApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		SumOfSquareNumber ch=new SumOfSquareNumber();
		ch.display(num);

	}

}
