
public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("-");
			}
			System.out.print("*");
			for(int k=3;k<=5;k++)
			{
				if(i==1||i==5)
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
