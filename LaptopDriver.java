class LaptopDriver
{
	public static void main(String[] args)
	{
		Laptop l = new Laptop();
		//l.price = 45000;
		//l.price = -35000;
		//System.out.println(l.price);

		l.setPrice(30000,1234);
		System.out.println(l.getPrice());
		//System.out.println(l); //address
	}
}
