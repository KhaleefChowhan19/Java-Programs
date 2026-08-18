package squarerootnumber;

import java.util.Scanner;

import armstrongnumber.ArmstrongNumber;

public class SquarerootNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		SquarerootNumber ch=new SquarerootNumber();
		ch.display(num);

	}

}
