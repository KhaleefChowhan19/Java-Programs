package threeschools;
import java.util.Scanner;
public class ThreeSchools3dArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][][]arr=new int[2][3][5];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("enter the school name"+(i+1)+"class name"+(j+1)+"student"+(k+1)+"marks is");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("the school name"+(i+1)+"class name"+(j+1)+"student"+(k+1)+"marks is"+arr[i][j][k]);
				}

	}

}
}
}

