package cuberootnumber;

import java.util.Scanner;

public class CuberootNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		CuberootNumber ch=new CuberootNumber();
		ch.display(num);


	}

}
