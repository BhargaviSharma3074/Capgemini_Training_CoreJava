class Laptop
{
	private int price = 50000;
	int cp = 30000;
	int pwd;
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price, int pwd)
	{
		if(price>=cp && pwd==1234)
		{
			this.price = price;
		}	
	}
}