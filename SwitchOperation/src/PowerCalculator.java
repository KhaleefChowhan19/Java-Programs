import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Base value: ");
		int a=scan.nextInt();
		System.out.println("Enter Exponent value: ");
		int b=scan.nextInt();
		PowerCalculator1 ps=new PowerCalculator1();
		ps.display(a,b);
	}
		
}
