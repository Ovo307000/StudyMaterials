package Chapter05.abstractTest;

public class Teacher extends Person
{
	private int salary;

	public Teacher() {}

	public Teacher(String name, int age, int salary)
	{
		super(name, age);
		this.salary = salary;
	}

	@Override
	public void doSomething()
	{
		System.out.println(STR."\{super.getName()} is teaching...");
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String toString()
	{
		return STR." \{super.toString()} Teacher {salary=\{salary} \{'}'}";
	}
}
