package Chapter05;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee
{
	private int bonus;

	public Manager() {}

	public Manager(String name, int age, int salary, int bonus, LocalDate hireDay)
	{
		super(name, age, salary, hireDay);
		this.bonus = bonus;
	}

	public static void main(String[] args)
	{
		System.out.println(new Manager().hashCode());
	}

	public int getSalary()
	{
		return super.getSalary() + this.bonus;
	}

	public int getBonus()
	{
		return this.bonus;
	}


	public int hashCode()
	{
		return Objects.hash(super.hashCode(), bonus);
	}
}