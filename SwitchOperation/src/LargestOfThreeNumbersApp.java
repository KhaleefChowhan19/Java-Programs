import java.util.Scanner;

public class LargestOfThreeNumbersApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter second number");
		int b=scan.nextInt();
		System.out.println("enter third number");
		int c=scan.nextInt();
		LargestThreeNumbers ps=new LargestThreeNumbers();
		ps.display(a,b,c);
	}

}
