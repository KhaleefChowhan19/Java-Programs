package semmarks;
import java.util.Scanner;
public class SemMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of semester");
		int sem=scan.nextInt();
		float[]arr=new float[sem];
		System.out.println("enter percentage in semester");
		for(int i=0;i<=arr.length-1;i++)
		{
			 System.out.println("enter the percentage for semester"+(i+1));
		   arr[i]=scan.nextFloat();
		  
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("the percentage of semester"+(i+1)+"is "+arr[i]);
		}

	}

}
