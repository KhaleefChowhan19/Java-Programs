package armstrongnumberrange;

import java.util.Scanner;
public class ArmstrongNumberRangeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		ArmstrongNumberRange ch=new ArmstrongNumberRange();
		ch.display(num);

	}

}
