package markstwodarry;
import java.util.Scanner;
public class Marks2dArray {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number of classes");
	int clas=scan.nextInt();
	System.out.println("enter the number of student at each class");
	int student=scan.nextInt();
	int[][]arr=new int[clas][student];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("enter the class name"+(i+1)+"student"+(j+1)+"marks is");
			arr[i][j]=scan.nextInt();
		}
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("class"+(i+1)+"student"+(j+1)+"marks is"+arr[i][j]);
		}

	}

}
}