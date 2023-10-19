package Chapter05.abstractTest;

public abstract class Person
{
	private String name;
	private int    age;

	public Person()
	{
	}

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public abstract void doSomething();

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	@Override
	public String toString()
	{
		return "person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
