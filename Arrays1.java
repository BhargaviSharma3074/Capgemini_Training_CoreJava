import java.util.Scanner;
import java.util.Arrays;
class Arrays1
{
	public static void main(String[]args)
	{
		/*
		int [] arr = new int[5];
		arr[0] = 10;
		arr[1] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("==========================================================");
		int[] ar = {10,20,30,40,50};
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		//COUNT EVEN AND ODD NUMBERS IN AN ARRAY
		/*
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int e = 0;
		int o = 0;
		int[] arr = new int[n];
		for(int i=0; i<n ;i++)
		{
			System.out.print("-> ");
			arr[i] = sc.nextInt();
			if(arr[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		Arrays.sort(arr);
		for(int x : arr)
		{
			System.out.println(x);
		}
		System.out.println("Number of even elements: "+e);
		System.out.println("Number of odd elements: "+o);
		*/
		
		
		//COUNT +VE, -VE AND 0 ELEMENTS
		/*
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int pos = 0;
		int neg = 0;
		int zer = 0;
		for(int i=0; i<n ;i++)
		{
			System.out.print("-> ");
			arr[i] = sc.nextInt();
			if(arr[i]==0)
			{
				zer++;
			}
			else if(arr[i]<0)
			{
				neg++;
			}
			else
			{
				pos++;
			}
		}
		System.out.println("Number of +ve elements: "+pos);
		System.out.println("Number of -ve elements: "+neg);
		System.out.println("Number of 0 elements: "+zer);
		*/
		
		
		//FIND THE PALINDROME NUMBERS IN THE GIVEN ARRAY
		
		
		
		
	}
}