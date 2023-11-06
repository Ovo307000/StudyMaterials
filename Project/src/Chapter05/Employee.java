package Chapter05;

import java.time.LocalDate;
import java.util.Objects;

public class Employee
{
	private static  int       nextId = 0;
	protected final int       id;
	// 设置员工属性
	private         LocalDate hireDay;
	private         String    name;
	private         int       salary;
	private         int       age;

	public Employee()
	{
		this.id = ++ nextId;
	}

	public Employee(String name, int age, int salary, LocalDate hireDay)
	{
		this.name    = name;
		this.age     = age;
		this.salary  = salary;
		this.hireDay = hireDay;
		this.id      = ++ nextId;
	}

	public static void main(String[] args)
	{

	}

	public static int getNextId()
	{
		return nextId;
	}

	public static void setNextId(int nextId)
	{
		Employee.nextId = nextId;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		Employee employee = (Employee) o;
		return id == employee.id && salary == employee.salary && age == employee.age && Objects.equals(hireDay,
		                                                                                               employee.hireDay) && Objects.equals(
				name, employee.name);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(hireDay, id, name, salary, age);
	}

	public LocalDate getHireDay()
	{
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay)
	{
		this.hireDay = hireDay;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return STR."\{getClass()}[name=\{name}, age=\{age}, salary=\{salary}, hireDay=\{hireDay}id=\{id}]";
	}
}
