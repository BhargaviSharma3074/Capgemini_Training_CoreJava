class Child1Driver
{
	public static void main(String[] args)
	{
		System.out.println("========Parent Object========");
		Parent1 p = new Parent1();
		System.out.println(p.name);
		System.out.println(p.age);
		p.bike();
		System.out.println("========Child Object========");
		Child1 c = new Child1();
		System.out.println(c.name);
		System.out.println(c.age);
		c.bike();
		System.out.println("========Upcasting========");
		Parent1 p1 = new Child1();
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.bike();
		System.out.println("========Downcasting========");
		Child1 c1 = (Child1)p1;
		System.out.println(c1.name);
		System.out.println(c1.age);
		c1.bike();
	}
}