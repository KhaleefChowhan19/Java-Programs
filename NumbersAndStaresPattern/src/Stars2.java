import java.util.Scanner;

public class Stars2 {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter any number");
	int a=scan.nextInt();
    System.out.println("enter the character");
    char ch=scan.next().charAt(0);
    /*
    for(int i=1;i<=a;i++)
    {
    	System.out.println(ch);
	}
	*/
    /*//using while loop
    int i=1;
    while(i<=a)
    {
    	System.out.println(ch);
    	i++;
    }*/
    //using do while loop
    int i=1;
    do
    {
    	System.out.println(ch);
    	i++;
    }
    while(i<=a);
}
}
