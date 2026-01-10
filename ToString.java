class ToString
{
	int roll;
	String name;
	int age;
	static String college = "Lovely Professionl University";
	
	public ToString(int roll, String name, int age, String college)
	{
		this.roll = roll;
		this.name = name;
		this.age = age;
		//this.college = "lpu";
	}
	
	
	void display()
	{
		System.out.print("Roll: "+roll+" ");
		System.out.print("Name: "+name+" ");
		System.out.print("Age: "+age+" ");
		System.out.println("College: "+college);
	}
	/*
	@Override
	public String toString()
	{
		return "Roll: "+roll+"\nName: "+name+"\nAge: "+age+"\nCollege: "+college+"\n========================";
	}
	*/
	public int hashCode()
	{
		return roll+name.hashCode()+age+college.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		ToString s = (ToString)obj;
		return (this.roll == s.roll && this.name == s.name && this.age == s.age && this.college == s.college);
	}
		
	public static void main(String[] args)
	{
		ToString t = new ToString(1, "Bhargavi", 21, "LPU");
		ToString t1 = new ToString(2, "Bhavya", 20, "LPU");
		ToString t2 = new ToString(3, "Anushka", 22, "LPU");
		ToString t3 = new ToString(4, "Pragya", 23, "LPU");
		ToString t4 = new ToString(5, "Darshana", 22, "LPU");
		ToString t5 = new ToString(6, "Priya", 21, "LPU");
		ToString t6 = new ToString(7, "Meghna", 21, "LPU");
		ToString t7 = new ToString(1, "Bhargavi", 20, "LPU");
		//ToString t7 = t;
		
		/*
		t.display();
		t1.display();
		t2.display();
		t3.display();
		t4.display();
		t5.display();
		t6.display();
		*/
		/*
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		System.out.println(t6);
		*/
		/*
		System.out.println("========HashCode========");
		System.out.println(t.toString()); //fetches address // when override method is commented
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t4.hashCode());
		System.out.println(t5.hashCode());
		System.out.println(t6.hashCode());
		System.out.println(t7.hashCode());
		System.out.println(t7.toString()); //gives the address of t
		*/
		System.out.println(t7.equals(t));
	}
}