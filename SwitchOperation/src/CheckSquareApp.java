import java.util.Scanner;

public class CheckSquareApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length");
		int a=scan.nextInt();
		System.out.println("enter breadth");
		int b=scan.nextInt();
		CheckSquare ps=new CheckSquare();
		ps.display(a,b);
	}

}
