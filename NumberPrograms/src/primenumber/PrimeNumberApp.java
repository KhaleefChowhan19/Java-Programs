package primenumber;
import java .util.Scanner;
public class PrimeNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		PrimeNumbers ch=new PrimeNumbers();
		ch.display(num);
	}

}
