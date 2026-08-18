package thefinancecalculator;

public class FinanceCalculator {
public double calculateSimpleInterest(double p,double r,double t)
{
	double simpleInterest=(p*t*r)/100;
	System.out.println("The Simple Interest is"+simpleInterest);
	return simpleInterest;
}
}
