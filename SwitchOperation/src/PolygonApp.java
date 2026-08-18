import java.util.Scanner;

public class PolygonApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the how many sides");
		int a=scan.nextInt();
		Polygon ps=new Polygon();
		ps.display(a);
	}

}
