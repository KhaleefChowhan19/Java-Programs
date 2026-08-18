package fibonaccinumber;

import java.util.Scanner;

public class FibonacciNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
	FibnacciNumber ch=new FibnacciNumber();
		ch.display(num);

	}

}
