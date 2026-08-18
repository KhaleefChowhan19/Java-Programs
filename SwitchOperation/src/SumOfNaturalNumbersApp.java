import java.util.Scanner;

public class SumOfNaturalNumbersApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int a=scan.nextInt();
		SumOfNaturalNumbers ps=new SumOfNaturalNumbers();
		ps.display(a);
	}

}
