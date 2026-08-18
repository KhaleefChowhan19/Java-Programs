
public class Pattern10 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				count=count+2;
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
