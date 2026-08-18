
public class Pattern12 {

	public static void main(String[] args) 
	{
		int count=0;
		int num=-1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				count=count+2;
				
				if(i==1||i==2)
				{
					System.out.print(count+" ");
				}
			
				num=num+2;
				if(i==3||i==4)
				{
					System.out.print(num+" ");
				}
					
				
			}
			System.out.println();
		}
				
		}
}
