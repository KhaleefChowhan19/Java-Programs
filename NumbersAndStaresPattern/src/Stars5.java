import java.util.Scanner;

public class Stars5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
	System.out.println("enter character that has to be printed");
	char ch=scan.next().charAt(0);
	/*//using for loop
	for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}*/
	/*//using while loop
	int i=1;
	while(i<=num)
	{
		int j=1;
		while(j<=i)
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
		while(j<=i);
		System.out.println();
		i++;
		
	}
	while(i<=num);
	}

}
