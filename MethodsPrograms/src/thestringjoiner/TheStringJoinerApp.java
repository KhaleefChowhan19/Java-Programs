package thestringjoiner;
import java.util.Scanner;
public class TheStringJoinerApp {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the first name");
	String str1=scan.next();
	System.out.println("enter the second name");
	String str2=scan.next();
	TheStringJoiner ch=new TheStringJoiner();
	ch.joinStrings(str1,str2);
	
	}

}
