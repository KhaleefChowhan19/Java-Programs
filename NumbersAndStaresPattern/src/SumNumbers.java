import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int a=scan.nextInt();
		SumNumber1 ch=new SumNumber1();
		ch.display(a);

	}

}
