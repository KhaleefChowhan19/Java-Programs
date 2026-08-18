package evennumber;
import java.util.Scanner;
public class EvenNumberApp {

	public static void main(String[] args) {
		
     Scanner scan=new Scanner (System.in);
     System.out.println("enter any number");
     int num=scan.nextInt();
     EvenNumbers ch=new EvenNumbers();
     ch.display(num);
	}

}
