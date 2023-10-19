package Chapter05;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Employee[]   staff       = new Employee[3];
		Manager[]    managers    = new Manager[3];
		Programmer[] programmers = new Programmer[3];

		Manager    boss       = new Manager("Most", 38, 10000, 5000, LocalDate.of(1994, 5, 8));
		Programmer programmer = new Programmer("Tom", 25, 6000, LocalDate.of(2017, 5, 8), "Java");

		staff[0] = boss;
		staff[1] = programmer;
		staff[2] = new Employee("Jack", 22, 3000, LocalDate.of(2019, 5, 8));


		boss.getId();
		for (Employee e : staff) {
			System.out.println(e.getName() + "\t" + e.getSalary() + "\t" + e.getHireDay());
		}
	}
}
