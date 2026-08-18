package backlogs;
import java.util.Scanner;
public class BackLogs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of semesters");
		int sem=scan.nextInt();
		String[]arr=new String[sem];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("do you have any backlog in semester"+(i+1));
			boolean res=scan.nextBoolean();
			if(res==true)
			{
				arr[i]="yes";
			}
			else
			{
				arr[i]="no";
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("backlog in semester"+(i+1)+":"+arr[i]);
		}

	}

}
