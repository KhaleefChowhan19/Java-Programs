package semestermarkaverager;
import java.util.Scanner;
public class SemesterMarksApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks for sem1");
		int sem1=scan.nextInt();
		System.out.println("enter the marks for sem2");
		int sem2=scan.nextInt();
		System.out.println("enter the marks for sem3");
		int sem3=scan.nextInt();
		System.out.println("enter the marks for sem4");
		int sem4=scan.nextInt();
		System.out.println("enter the marks for sem5");
		int sem5=scan.nextInt();
		System.out.println("enter the marks for sem6");
		int sem6=scan.nextInt();
		System.out.println("enter the marks for sem7");
		int sem7=scan.nextInt();
		System.out.println("enter the marks for sem8");
		int sem8=scan.nextInt();
		SemesterMarks ch=new SemesterMarks();
		ch.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
	}

}
