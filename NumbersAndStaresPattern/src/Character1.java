
public class Character1 {
public static void  display(char ch1)
{
	if(ch1>='a'&&ch1<='z')
	{
		if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
		{
			System.out.println("it is a lower case vowel");
		}
		else
		{
			System.out.println("it is a lower case consonant");
		}
	}
	else if(ch1>='A'&&ch1<='Z')
	{
		if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
		{
			System.out.println("it is a upper case vowel");
		}
		else
		{
			System.out.println("it is a upper case consonant");
		}	
	}
	else if(ch1>='0'&&ch1<='9')
	{
		System.out.println("it is a digit");
	}
	else
	{
		System.out.println("it is a special character ");
	}
}
}
