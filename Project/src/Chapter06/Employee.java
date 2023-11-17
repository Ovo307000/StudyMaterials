package Chapter06;

import org.jetbrains.annotations.NotNull;

public class Employee
		implements java.lang.Comparable<Employee>
{
	private double salary;


	@Override
	public int compareTo(@NotNull Employee o)
	{
		return Double.compare(o.salary, this.salary);
	}
}
