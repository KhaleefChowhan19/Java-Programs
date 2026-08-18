package thejourneycalculator;
import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the speed");
	double speed=scan.nextDouble();
	System.out.println("enter the time");
	double time=scan.nextDouble();
	JourneyCalculator ch=new JourneyCalculator();
	ch.calculateDistance(speed,time);

	}

}
