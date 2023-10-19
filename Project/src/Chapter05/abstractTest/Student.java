package Chapter05.abstractTest;

public class Student extends Person
{
	private int level;

	@Override
	public String toString()
	{
		return super.toString() + "Student{" + "level=" + level + '}';
	}

	public Student()
	{
	}

	public Student(String name, int age, int level)
	{
		super(name, age);
		this.level = level;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	@Override
	public void doSomething()
	{
		System.out.println(super.getName() + "is learning...");
	}
}
