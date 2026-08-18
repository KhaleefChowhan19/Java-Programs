package timeconverter;

import java.util.Scanner;

public class TimeConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the time");
		double time=scan.nextDouble();
		TimeConverter convert=new TimeConverter();
		convert.convertToHours(time);
	}

}
