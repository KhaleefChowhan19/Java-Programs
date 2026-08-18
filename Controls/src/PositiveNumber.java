import java.util.Scanner;
public class PositiveNumber {

	public static void main(String[] args) {
		//creating the object of scanner class
		Scanner scan=new Scanner(System.in);
		//asking user to enter a number
		System.out.println("enter the number");
		//reading and storing the variable in variable a
		int a=scan.nextInt();
		//creating the object of positive class
		Positive ps=new Positive();
		//calling the display method
		ps.display(a);

	}

}
