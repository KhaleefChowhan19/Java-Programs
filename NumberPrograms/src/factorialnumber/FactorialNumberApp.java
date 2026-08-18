package factorialnumber;

import java.util.Scanner;

import sumnumber.SumNumbers;

public class FactorialNumberApp {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
	     System.out.println("enter any number");
	     int num=scan.nextInt();
	     FactorialNumber ch=new FactorialNumber();
	     ch.display(num);


	}

}
