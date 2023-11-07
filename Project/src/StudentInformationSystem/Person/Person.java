package StudentInformationSystem.Person;

public class Person
{
	private static int    nextId = 0;
	protected      int    id;
	private        String name;
	private        int    age;

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

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getId()
	{
		return this.id;
	}
}
