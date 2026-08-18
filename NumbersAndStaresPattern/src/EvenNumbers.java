import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int a=scan.nextInt();
		EvenNumber1 ch=new EvenNumber1();
		ch.display(a);
	}

}
