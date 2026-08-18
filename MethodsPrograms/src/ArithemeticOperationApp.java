import java.util.Scanner;

public class ArithemeticOperationApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=scan.nextInt();
		System.out.println("enter the second number");
		int num2=scan.nextInt();
		ArithemeticOperation ch=new ArithemeticOperation();
		ch.subtractNumbers(num1,num2);
		ch.multiplyNumbers(num1,num2);
		ch.divideNumbers(num1,num2);
		ch.findRemainder(num1,num2);
	}

}
