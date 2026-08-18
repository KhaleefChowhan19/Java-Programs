package employee2darry;
import java.util.Scanner;
public class Employee2dArray {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
System.out.println("enter the number of companies");
int companie=scan.nextInt();
System.out.println("enter the no.of empoyees each company");
int employee=scan.nextInt();
String[][]arr=new String[companie][employee];
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.println("enter the name for company"+(i+1)+"empoyee"+(j+1));
		arr[i][j]=scan.next();
	}
}
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
	System.out.println("the name of company"+(i+1)+"employee"+(j+1)+"is"+arr[i][j]);
	}
}
	}

}
