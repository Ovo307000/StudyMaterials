package Chapter06;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class SortTest
{
	public static void main(String[] args)
	{
		List<Employees> staff = new ArrayList<>();

		staff.add(new Employees("Harry Hacker", 35, 35000));
		staff.add(new Employees("Carl Cracker", 25, 75000));
		staff.add(new Employees("Tony Tester", 30, 38000));

		staff.sort(comparing(Employees::getName));


		PrintStream Stdout = System.out;
	}
}

class Employees
{
	private String name;
	private int    age;
	private int    salary;


	public Employees(String name, int age, int salary)
	{
		this.name   = name;
		this.age    = age;
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void raiseSalary(int byPercent)
	{
		int raise = salary * byPercent / 100;
		salary += raise;
	}

	public Employees compareByName(Employees e)
	{
		return this.name.compareTo(e.name) > 0 ?
		       this : e;
	}

}
