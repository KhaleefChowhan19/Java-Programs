package thecubenumber;

import java.util.Scanner;

public class CubeNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		CubeNumber ch=new CubeNumber();
		ch.display(num);
	}

}
