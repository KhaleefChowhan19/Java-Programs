package namesofemployees;
import java.util.Scanner;
public class NameOfEmployee {

	public static void main(String[] args) {
		/*String[]name=new String[10];
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the employees name");
		for(int i=0;i<=9;i++)
		{
			name[i]=scan.next();
		}
		System.out.println("the names are ;");
		for(int i=0;i<=9;i++)
		{
			System.out.println(name[i]+" ");
		}*/
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the how many employees");
		int size=scan.nextInt();
		String[]arr=new String[size];
		System.out.println("enter the names of employees");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next();
		}
		System.out.println("the names are :");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
