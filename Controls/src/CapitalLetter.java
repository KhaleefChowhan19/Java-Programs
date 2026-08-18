import java.util.Scanner;
public class CapitalLetter {

	public static void main(String[] args) {
		//creating the object of scanner class
		Scanner scan=new Scanner(System.in);
		//asking user to enter a number
		System.out.println("enter a character");
		//reading and storing the variable in variable a
		char a=scan.next().charAt(0);
		//creating the object of Capital class
		Capital pr=new Capital();
		//calling the display method
		pr.display(a);
	}

}
