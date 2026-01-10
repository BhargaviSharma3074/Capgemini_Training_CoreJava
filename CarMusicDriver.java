class CarMusicDriver
{
	public static void main(String[] args)
	{
		Car1 c = new Car1();
		System.out.println("========Calling Engine Member========");
		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c.wheel);
		System.out.println(c);
		c.StartMP();
		System.out.println("========Calling Engine Member========");
		System.out.println(c.mp.bass);
		System.out.println(c.mp.volume);
		System.out.println(c.mp.mode);
		System.out.println(c.mp);
	}
}