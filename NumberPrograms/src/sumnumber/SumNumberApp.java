package sumnumber;

import java.util.Scanner;

import productofoddnumber.OddNumbers;

public class SumNumberApp {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
	     System.out.println("enter any number");
	     int num=scan.nextInt();
	     SumNumbers ch=new SumNumbers();
	     ch.display(num);

	}

}
