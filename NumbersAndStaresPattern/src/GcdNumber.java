import java.util.Scanner;

public class GcdNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter second number");
		int b=scan.nextInt();
	GcdNumber1 ch=new GcdNumber1();
		ch.display(a,b);
	}

}
