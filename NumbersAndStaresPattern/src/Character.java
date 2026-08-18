import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any character");
		char ch1=scan.next().charAt(0);
		Character1 ch=new Character1();
		ch.display(ch1);

	}

}
