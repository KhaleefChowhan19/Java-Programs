package thefinancecalculator;
import java.util.Scanner;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the principle amount");
	double p=scan.nextDouble();
	System.out.println("enter the rate of interest");
	double r=scan.nextDouble();
	System.out.println("enter the time");
	double t=scan.nextDouble();
	FinanceCalculator calculator=new FinanceCalculator();
	calculator.calculateSimpleInterest(p,r,t);
	

	}

}
