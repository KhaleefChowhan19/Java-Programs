package theheightconverter;
import java.util.Scanner;
public class HeightConverterApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the height");
	double height=scan.nextDouble();
	HeightConverter converter=new HeightConverter();
	converter.convertInchesToFeet(height);

	}

}
