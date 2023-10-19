package Chapter05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test
{
	public static void main(Object... args)
	{
		Test test = new Test();

		test.wrapperTest();
	}

	private void run()
	{
		Employee[]   staff       = new Employee[3];
		Manager[]    managers    = new Manager[3];
		Programmer[] programmers = new Programmer[3];

		List<Employee> staffs = new ArrayList<>();

		Manager    boss       = new Manager("Most", 38, 10000, 5000, LocalDate.of(1994, 5, 8));
		Programmer programmer = new Programmer("Tom", 25, 6000, LocalDate.of(2017, 5, 8), "Java");

		staff[0] = boss;
		staff[1] = programmer;
		staff[2] = new Employee("Jack", 22, 3000, LocalDate.of(2019, 5, 8));


		boss.getId();
		for (Employee e : staff)
		{
			System.out.println(e.getName() + "\t" + e.getSalary() + "\t" + e.getHireDay());
		}
	}

	private void listTest()
	{
		List<Employee> staffs = new ArrayList<>();

		staffs.add(new Employee("Jack", 22, 3000, LocalDate.of(2019, 5, 8)));
		staffs.add(new Employee("Tom", 22, 3000, LocalDate.of(2019, 5, 8)));
		staffs.add(new Employee("Jerry", 22, 3000, LocalDate.of(2019, 5, 8)));
		staffs.add(new Employee("Most", 22, 3000, LocalDate.of(2019, 5, 8)));
		staffs.add(new Employee("Jack", 22, 3000, LocalDate.of(2019, 5, 8)));

		for (Employee staff : staffs)
		{
			System.out.println(staff);
			staffs.remove(staff);
		}
	}

	private void wrapperTest()
	{
		Integer number1 = 1;
		Integer number2 = 1;

		if (number1 == number2)
		{
			System.out.println("Ture");
		}
		else
		{
			System.out.println("False");
		}

		if (number1.equals(number2))
		{
			System.out.println("Equal Ture");
		}
		else
		{
			System.out.println("Equal False");
		}

		StringBuilder str1 = new StringBuilder("Hello");


	}

	public void test()
	{
		Manager[] managers = new Manager[3];
		Employee  employee = managers[0];

		managers[0] = new Manager("zhangsan", 22, 3000, 1000, LocalDate.of(2019, 5, 8));

		System.out.println(
				managers[0].getName() + "\t" + managers[0].getSalary() + "\t" + managers[0].getHireDay() + "\t" + managers[0].getBonus());
	}
}
