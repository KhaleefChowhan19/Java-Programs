
public class Pattern9 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("-");
			}
			System.out.print("*");
			for(int k=3;k<=i;k++)
			{
				if(i==5)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
