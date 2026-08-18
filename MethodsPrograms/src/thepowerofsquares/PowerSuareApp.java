package thepowerofsquares;
import java.util.Scanner;
public class PowerSuareApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	PowerSquare ch=new PowerSquare();
	ch.squareNumber(num);
	}

}
