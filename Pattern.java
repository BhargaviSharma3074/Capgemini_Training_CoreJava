class Pattern
{
	public static void main(String[] args)
	{
		/*
		System.out.println("* ");
		System.out.print("* ");
		System.out.println("* ");
		System.out.print("* ");
		System.out.print("* ");
		System.out.print("* ");
		
		//System.out.print() -> gives compile time error if compiled without passing any data
		//System.out.println() -> compiles successfully
		*/
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=================================================");
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
			
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<6; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
			
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<6; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		int k=1;
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<6; j++)
			{
				if(k<=9)
				{
					System.out.print(k++ +"  ");
				}
				else
				{
					System.out.print(k++ +" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		int x=1;
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<6; j++)
			{
				if(x==10)
				{
					x=1;
				}
				System.out.print(x++ +" ");
				
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		for(int i=1; i<6; i++)
		{
			char ch='A';
			for(int j=1; j<6; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		for(int i=1; i<6; i++)
		{
			char ch='Z';
			for(int j=1; j<6; j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		char ch='A';
		for(int i=1; i<6; i++)
		{	
			for(int j=1; j<6; j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		char ch1='E';
		for(int i=1; i<6; i++)
		{	
			for(int j=1; j<6; j++)
			{
				System.out.print(ch1+" ");
			}
			ch1--;
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		char ch2='A';
		for(int i=1; i<6; i++)
		{	
			for(int j=1; j<6; j++)
			{
				System.out.print(ch2++ +" ");
			}
			
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		for(int i=1; i<6; i++)
		{	
			char ch3='E';
			for(int j=1; j<6; j++)
			{
				System.out.print(ch3 +" ");
				ch3--;
			}
			
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		int m = 1;
		for(int i=1; i<6; i++)
		{	
			for(int j=1; j<6; j++)
			{
				if(m==0)
				{
					System.out.print(m++ +" ");
				}
				else 
				{
					System.out.print(m-- +" ");
				}
				
			}
			
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		int n = 5;
		for(int i=1; i<=5; i++)
		{	
			for(int j=1; j<=i; j++)
			{
				System.out.print(n-- +" ");
					
			}
			
			
			System.out.println();
			n=5;
		}
		
		
		/*
		
		l
		m n 
		o p q
		r s t u
		v w x y z
		
		5
		4 5
		3 4 5
		2 3 4 5
		1 2 3 4 5
		
		*/
		
		System.out.println("==================================================");
		
		int n1 = 5;
		for(int i=1; i<=n1; i++)
		{	
			for(int s=1; s<=n1-i; s++)
			{
				System.out.print("  ");
				
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(" *");
			
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		int n2 = 1;
		for(int i=1; i<=5; i++)
		{	
			for(int s=1; s<=i; s++)
			{
				if(n2==1)
				{
					System.out.print(n2-- + " ");
				}
				else
				{
					System.out.print(n2++ +" ");
				}	
			}
			n2=1;
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		for(int i=1; i<=5; i++)
		{	
			for(int j=0; j<=5-i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		System.out.println("==================================================");
		
		int n4 = 5;
		for(int i=1; i<=n4; i++)
		{	
			for(int s=1; s<=n4-i; s++)
			{
				System.out.print("  ");
				
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(" *  ");
			
			}
			for(int t=1; t<=n4-i; t++)
			{
				System.out.print("  ");
				
			}
			System.out.println();
		}
		
	}
}