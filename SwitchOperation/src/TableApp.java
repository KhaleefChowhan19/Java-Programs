import java.util.Scanner;

public class TableApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int a=scan.nextInt();
		Table ps=new Table();
		ps.display(a);
	}

}
