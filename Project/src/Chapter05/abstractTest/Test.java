package Chapter05.abstractTest;

import java.util.ArrayList;

public class Test
{
	public static void main(String[] args)
	{
		ArrayList<Person> people = new ArrayList<>();

		people.add(new Student("Tom", 18, 1));
		people.add(new Student("Jerry", 19, 2));
		people.add(new Student("Spike", 20, 3));

		people.add(new Teacher("Jack", 30, 8000));
		people.add(new Teacher("Most", 40, 10000));


		for (Person person : people)
		{
			person.doSomething();

			System.out.println(person);
		}

		for (Person person : people)
		{
			if (person instanceof Student student)
			{
				System.out.println(student.getName() + "is" + student.getLevel() + "level" + "age is" + student.getAge() + "years old. \n"
				                   + "He is a " + student.getClass().getSimpleName());
			}
			else if (person instanceof Teacher teacher)
			{
				System.out.println(teacher.getName() + "is" + teacher.getSalary() + "salary" + "age is" + teacher.getAge() + "years old. \n"
				                   + "He is a " + teacher.getClass().getSimpleName());
			}
		}
	}
}
