package ageprogram;
import java.util.Scanner;
public class AgeApp {

	public static void main(String[] args) {
		int[]age=new int[5];
		/*age[0]=18;
		age[1]=14;
		age[2]=17;
		age[3]=21;
		age[4]=24;
		System.out.println("enter the age :");
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);*/
		
Scanner scan=new Scanner(System.in);
System.out.println("enter the age");
for(int i=0;i<=4;i++)
{
	age[i]=scan.nextInt();
}
System.out.println("enter the age is :");
for(int i=0;i<=4;i++)
{
	System.out.print(age[i]+" ");
}

	}

}
