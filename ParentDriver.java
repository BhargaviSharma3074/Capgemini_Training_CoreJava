public class ParentDriver
{
	public static void main(String[] args)
	{
		Father f = new Daughter();
		f.bike();
		Mother m = new Daughter();
		m.bike();
	}
}
	