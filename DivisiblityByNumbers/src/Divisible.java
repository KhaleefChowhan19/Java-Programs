import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter any number");
	int num=scan.nextInt();
	Divisible1 ps=new Divisible1();
	
	if(num>100)
	{
		System.out.println(num);
	}
	else
	{
		System.out.println("invalid input");
	}
	ps.divisible2(num);
	ps.divisible3(num);
	ps.divisible5(num);
	ps.divisible2and5(num);
	ps.divisible3and5(num);
	ps.evennumber3(num);
	ps.oddnumber5(num);
	ps.primenumber(num);
	ps.evenprime(num);
	ps.oddprime(num);
	}

}
