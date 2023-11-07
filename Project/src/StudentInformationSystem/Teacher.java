package StudentInformationSystem;

public class Teacher extends Person
{
	private final        int id;
	private static final int nextId = 0;
	private final        int salary;

	public Teacher(String name, int age, int id, int salary)
	{
		super(name, age);
		this.id     = id;
		this.salary = salary;
	}

	public Teacher(int id, int salary)
	{
		this.id     = id;
		this.salary = salary;
	}
}
