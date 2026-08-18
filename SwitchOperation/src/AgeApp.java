import java.util.Scanner;
public class AgeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter age");
		int a=scan.nextInt();
		Age ps=new Age();
		ps.display(a);
	}

}
