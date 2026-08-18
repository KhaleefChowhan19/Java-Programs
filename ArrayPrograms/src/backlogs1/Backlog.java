package backlogs1;
import java.util.Scanner;
public class Backlog {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number of semester");
	int number=scan.nextInt();
	int[]arr=new int[number];
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.println("do you have any backlog in semester"+(i+1));
	boolean a=scan.nextBoolean();
	if(a==true)
	{
		System.out.println("enter the number of backlogs in semester"+(i+1));
		arr[i]=scan.nextInt();
	}
	else
	{
		arr[i]=0;
	}
	}
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("the number of backlog in semester"+(i+1)+"is"+arr[i]);
}
}
}
