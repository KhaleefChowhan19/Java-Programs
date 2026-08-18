package productofoddnumber;

import java.util.Scanner;

import evennumber.EvenNumbers;

public class OddNumberApp {

	public static void main(String[] args) {
		
	     Scanner scan=new Scanner (System.in);
	     System.out.println("enter any number");
	     int num=scan.nextInt();
	     OddNumbers ch=new OddNumbers();
	     ch.display(num);

	}

}
