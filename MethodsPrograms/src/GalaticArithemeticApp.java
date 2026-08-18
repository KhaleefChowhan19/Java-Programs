import java.util.Scanner;
public class GalaticArithemeticApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first number");
	long num1=scan.nextLong();
	System.out.println("enter the second number");
	long num2=scan.nextLong();
	GalaticArithemetic ch=new GalaticArithemetic();
	ch.galaticAddition(num1,num2);
	}

}
