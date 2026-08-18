package thetemperatureconverter;

public class TemperatureConverter {
public double convertFahernhitToCelsious(double temp)
{
	double c=(temp-32)*5/9;
	System.out.println("the temperature converer is"+c);
	return c;
}
}
