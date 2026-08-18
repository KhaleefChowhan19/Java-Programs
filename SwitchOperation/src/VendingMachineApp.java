import java.util.Scanner;

public class VendingMachineApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter character");
		String a=scan.nextLine();
		VendingMachine ps=new VendingMachine ();
		ps.display(a);

	}

}
