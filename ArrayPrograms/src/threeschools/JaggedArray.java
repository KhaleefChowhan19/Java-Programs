package threeschools;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of schools");
		int school=scan.nextInt();
		//creating a 3D jagged array 
		int[][][]arr=new int[school][][];
		//creating rows in 3D jagged array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the no of classes in school"+(i+1));
			int row=scan.nextInt();
			arr[i]=new int[row][];

		}
		//creating columns in 3D jagged array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{

				System.out.println("enter the no of student in school"+(i+1)+"class"+(j+1));
				int stu=scan.nextInt();
				arr[i][j]=new int[stu];

			}
		}
		//storing the values in 3D array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("enter the marks in school"+(i+1)+"class"+(j+1)+"student"+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		//displaying the 3D array
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("the school name"+(i+1)+"class"+(j+1)+"student"+(k+1)+"marks is"+arr[i][j][k]);

				}
			}
		}

	}
}
