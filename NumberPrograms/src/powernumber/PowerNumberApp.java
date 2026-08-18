package powernumber;

import java.util.Scanner;

public class PowerNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter base number");
		int base=scan.nextInt();
		System.out.println("enter exponent number");
		int exponent=scan.nextInt();
		PowerNumber ch=new PowerNumber();
		ch.display(base,exponent);


	}

}
