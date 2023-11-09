package Chapter05.ReflectionTest;

import Chapter04.Employee;

public class Test
{
	public static void main(String[] args)
			throws ClassNotFoundException
	{
		var className = "Employee";

		Class c = Class.forName(className);

		Object obj = c.getConstructors()
		              .getClass();

		System.out.println(obj);
	}
}
