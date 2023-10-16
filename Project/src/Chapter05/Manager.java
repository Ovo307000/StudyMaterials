package Chapter05;

import java.time.LocalDate;

public class Manager extends Employee {
	private int bonus;

	public Manager(String name, int age, int salary, int bonus, LocalDate hireDay) {
		super(name, age, salary, hireDay);
		this.bonus = bonus;
	}

	public int getSalary() {
		return super.getSalary() + this.bonus;
	}
}