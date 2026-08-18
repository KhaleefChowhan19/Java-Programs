
public class Pattern8 {

	public static void main(String[] args) {
		int count=26;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				count--;
				if(count<=9)
				{
				System.out.print("0"+count+" ");
				}
				else
				{
					System.out.print(count+" ");
				}
				
			}
			
			System.out.println();
			
		}

	}

}
