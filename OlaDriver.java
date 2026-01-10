class OlaDriver
{
	public static void main(String[] args)
	{
		Ola o = new Ola();
		
		if(o instanceof Car2)
		{
			Car2 c = (Car2)o;
			System.out.println(c.color);
			System.out.println(c.seat);
			System.out.println(c.tyre);
			System.out.println("===================================");
			
		}
	}
}