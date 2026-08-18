
public class Divisible1 {
public int divisible2(int num)
{
	System.out.println("divisible by 2 :");
	for(int i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			System.out.print( i +" ");
		}
		
	}
	System.out.println();
	return num;
}
public int divisible3(int num)
{
	System.out.println("divisible by 3 :");
	for(int i=1;i<=num;i++)
	{
		if(i%3==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int divisible5(int num)
{
	System.out.println("divisible by 5 :");
	for(int i=1;i<=num;i++)
	{
		if(i%5==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int divisible2and5(int num)
{
	System.out.println("divisible by 2and5 :");
	for(int i=1;i<=num;i++)
	{
		if(i%5==0 && i%2==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int divisible3and5(int num)
{
	System.out.println("divisible by 3and5 :");
	for(int i=1;i<=num;i++)
	{
		if(i%5==0 && i%3==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int evennumber3(int num)
{
	System.out.println("even number divisible by 3 :");
	for(int i=1;i<=num;i++)
	{
		if(i%2==0 && i%3==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int oddnumber5(int num)
{
	System.out.println("odd number divisible by 3 :");
	for(int i=1;i<=num;i++)
	{
		if(i%2!=0 && i%5==0)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int primenumber(int num)
{
	System.out.println(" prime number :");
	int count=0;
	for(int i=1;i<=num;i++)
	{
		count=0;
		for(int j = 2;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
			
		}
		if(count==1)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int evenprime(int num)
{
	System.out.println("even prime number :");
	int count=0;
	for(int i=1;i<=num;i++)
	{
		count=0;
		for(int j = 2;j<=i;j++)
		{
			if(i%j==0 && i%2==0)
			{
				count++;
			}
			
		}
		if(count==1)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
public int oddprime(int num)
{
	System.out.println("odd prime number :");
	int count=0;
	for(int i=1;i<=num;i++)
	{
		count=0;
		for(int j = 2;j<=i;j++)
		{
			if(i%j==0 && i%2!=0)
			{
				count++;
			}
			
		}
		if(count==1)
		{
			System.out.print(i+" ");
		}
	}
	System.out.println();
	return num;
}
}
