package percentage2darray;
import java.util.Scanner;
public class PercentageJaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of classes");
		int row=scan.nextInt();
		float [][]arr=new float[row][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the number of students in class"+(i+1));
			int col=scan.nextInt();
			arr[i]=new float[col];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter percentage for class"+(i+1)+"student"+(j+1));
				arr[i][j]=scan.nextFloat();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("the percentage of class"+(i+1)+"student"+(j+1)+"is"+arr[i][j]);
			}
		
	}

}
}
