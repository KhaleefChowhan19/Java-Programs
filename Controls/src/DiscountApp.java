import java.util.Scanner;

public class DiscountApp {

	public static void main(String[] args) {
		//creating the object of scanner class
		Scanner scan=new Scanner(System.in);
		//asking user to enter a number
		System.out.println("enter the purchase price");
		//reading and storing the variable in variable a
		int a=scan.nextInt();
		//creating the object of Discount class
		Discount ps=new Discount();
		//calling the display method
		ps.display(a);
	}

}
