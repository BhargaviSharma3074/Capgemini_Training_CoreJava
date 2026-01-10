import java.util.*;
class Practise2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		/*
		//CHECK IF THE NUMBER IS PRIME OR NOT
		int n = input.nextInt();
		if(n<=1)
		{
			System.out.println("The number is not prime");
		}
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.println("The number is not prime");
			}
		}
		System.out.println("The number is prime");
		*/
		
		/*
		//REVERSE A NUMBER
		int n = input.nextInt();
		while(n>=1)
		{
			System.out.print(n%10);
			n/=10;
		}
		*/
		
		
		//CHECK WHETHER A NUMBER IS A PALINDROME
		int n = input.nextInt();
		int m = 0;
		while(n>=1)
		{
			m+=n%10;
			n/=10;
		}
		System.out.println(m);
		if(n==m)
		{
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}


	}
}