package StudentInformationSystem;

public class Person
{
	private String name;
	private int    age;
	private static int nextId = 0;
	protected int id;

	public Person(String name, int age)
	{
		this.name = name;
		this.age  = age;
		this.id   = ++ nextId;
	}

	public Person() {}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

	public int getId()
	{
		return this.id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
