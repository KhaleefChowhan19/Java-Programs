import java.util.Scanner;
public class PassApp {

	public static void main(String[] args) {
		//creating the object of scanner class
		Scanner scan=new Scanner(System.in);
		//asking user to enter a number
		System.out.println("enter the marks");
		//reading and storing the variable in variable a
		int a=scan.nextInt();
		//creating the object of pass class
		Pass ps=new Pass();
		//calling the display method
		ps.display(a);

	}

}
