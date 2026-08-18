import java.util.Scanner;
public class VoteApp {

	public static void main(String[] args) {
		//creating the object of scanner class
		Scanner scan=new Scanner(System.in);
		//asking user to enter the age
		System.out.println("enter the age");
		//reading and storing the variable in variable a
		int a=scan.nextInt();
		//creating the object of Vote class
		Vote ps=new Vote();
		//calling the display method
		ps.display(a);
	}

}
