package halveit;

import java.util.Scanner;

public class HalveItApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		double num=scan.nextDouble();
		HalveIt ch=new HalveIt();
		ch.halveTheNumber(num);


	}

}
