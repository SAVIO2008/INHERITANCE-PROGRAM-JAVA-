class a
{
	String name="A";
	void display1()
	{
		System.out.println(name);
	}
}
class b extends a
{
	int age=25;
	void display2()
	{
		System.out.println(age);
	}
}
class c extends b
{
	int salary=200000;
	void display3()
	{
		System.out.println(salary);
	}
}
public class MulInh
{
	public static void main(String[] args)
	{
		c obj=new c();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}