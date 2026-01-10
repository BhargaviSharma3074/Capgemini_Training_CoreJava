//write a program to check if two strings are anagrams
import java.util.Arrays;
public class Questions
{
	public static void main(String[] args)
	{
		CheckAnagram("Mother in law","Hitler woman");
	}
		
	static void CheckAnagram(String s1, String s2)
	{
		s1 = s1.replaceAll("\\s","").toLowerCase();
		s2 = s2.replaceAll("\\s","").toLowerCase();
	
		char[] s1a = s1.toCharArray();
		char[] s2a = s2.toCharArray(); 
		Arrays.sort(s1a);
		Arrays.sort(s2a);
		if(Arrays.equals(s1a,s2a))
		{
			System.out.println("Strings are anagrams.");
		}
		else
		{
			System.out.println("Strings are not anagrams.");
		}
	}
	
	//write a program to count uppercase, lowercase, numbers, special character and spaces	
	static void CountChar(String s)
	{
			
	}
	
}


