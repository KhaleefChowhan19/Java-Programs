import java.util.Scanner;

public class Stars4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of row");
		int row=scan.nextInt();
		System.out.println("enter the value of coloumn");
		int coloumn=scan.nextInt();
		System.out.println("enter the character that has be printed");
		char ch=scan.next().charAt(0);
		/*//using for loop
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=coloumn;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}*/
		/*
		// using while loop
		int i=1;
		while(i<=row)
		{
			int j=1;
			while(j<=coloumn)
			{
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}*/
		//using do while loop
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print(ch);
				j++;
			}
			while(j<=coloumn);
			System.out.println();
			i++;
		}
		while(i<=row);
		
		
	}	
}

		
		
		
		

