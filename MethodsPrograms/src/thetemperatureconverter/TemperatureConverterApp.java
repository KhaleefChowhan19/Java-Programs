package thetemperatureconverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temperature in Fahernhit");
		double temp=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		temperatureConverter.convertFahernhitToCelsious(temp);
	}

}
