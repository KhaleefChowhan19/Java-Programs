package thedoubletrouble;
import java.util.Scanner;
public class TheDoubleTroubleApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	TheDoubleTrouble ch=new TheDoubleTrouble();
	ch.doubleTheNumber(num);
	}

}
