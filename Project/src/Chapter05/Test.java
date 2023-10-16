package Chapter05;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		Manager boss = new Manager("Monst", 38, 10000, 5000, LocalDate.of(1994, 5, 8));

		staff[0] = boss;
		staff[1] = new Employee("Jack", 20, 4000, LocalDate.of(2001, 4, 5));
		staff[2] = new Employee("Tom", 20, 5000, LocalDate.of(1994, 5, 8));

		for (Employee e : staff) {
			System.out.println(e.getName() + "\t" + e.getSalary() + "\t" + e.getHireDay());
		}
	}
}
