import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int a=scan.nextInt();
		EvenApp ps=new EvenApp();
		ps.display(a);
		
	}

}
