package ProtectedTest;

import Chapter05.Employee;

import java.time.LocalDate;
import java.util.StringJoiner;

public class ProtectedTest01 extends Employee
{

	protected int    id;
	private   String name;

	public ProtectedTest01()
	{
	}

	public static void main(String[] args)
	{
		ProtectedTest01 test = getProtectedTest01();
		// 无法访问 Protected final 修饰符的 id 属性

		String testInfo = getTestInfo(test);

		// 打印对象属性
		System.out.println(testInfo);
	}

	private static ProtectedTest01 getProtectedTest01()
	{
		ProtectedTest01 test = new ProtectedTest01();

		test.setAge(18);
		test.setName("张三");
		test.setSalary(10000);
		test.setHireDay(LocalDate.of(2020, 1, 1));
		return test;
	}

	private static String getTestInfo(ProtectedTest01 test)
	{
		StringJoiner testInfo = new StringJoiner(" , ", "[", "]");

		testInfo.add(test.getClass()
		                 .getName());
		testInfo.add("name = " + test.getName());
		testInfo.add("age = " + test.getAge());
		testInfo.add("id = " + test.getId());
		testInfo.add("hireDay = " + test.getHireDay());
		testInfo.add("salary = " + test.getSalary());

		getProtectedTest01();


		return testInfo.toString();
	}

	public void run()
	{
	}
}
