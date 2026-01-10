class NoBalanceFoundException extends Throwable
{
	
}

public class ThrowTest
{
	public static void main(String[] args) throws NoBalanceFoundException
	{
		int bal=10;
		if(bal>1000)
		{
			System.out.println("You have money");
		}
		else
		{
			NoBalanceFoundException n = new NoBalanceFoundException();
			throw n;
		}
			
	}
}

