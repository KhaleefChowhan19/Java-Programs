package armstrongnumber;

import java.util.Scanner;

import palindrome.PalindromeNumber;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number");
		int num=scan.nextInt();
		ArmstrongNumber ch=new ArmstrongNumber();
		ch.display(num);

		/*long n=0;
		long rem=0;
		long sum=0;
		for(int i=1;i<=1000;i++)
		{
			n=i;
			while(n>0)
			{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			}
		
		if(sum==i)
		{
			System.out.println("armstrong number"+i);
		}
		sum=0;
	}*/

}
}
