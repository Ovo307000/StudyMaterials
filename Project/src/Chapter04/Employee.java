package Chapter04;

import java.time.LocalDate;

public class Employee {
	// 成员属性
	private static int           nextId = 0;
	private final  int           id;
	private        StringBuilder name;
	private        StringBuilder position;
	private        LocalDate     hireDay;
	private        double        salary;
	private        int           age;

	public Employee() {
		this.id = ++ nextId;
	}

	public Employee(StringBuilder name,
	                StringBuilder position,
	                LocalDate hireDay,
	                double salary,
	                int age) {
		this.id       = ++ nextId;
		this.name     = name;
		this.position = position;
		this.hireDay  = hireDay;
		this.salary   = salary;
		this.age      = age;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
	}

	public void raiseSalary(double byPercent, Object obj) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}

	@Override
	public String toString() {
		return ("Employee{" + "id=" + id + ", name=" + name + ", position=" + position + ", hireDay=" + hireDay + ", salary=" + salary + ", age=" + age + '}');
	}

	public int getId() {
		return id;
	}

	public StringBuilder getName() {
		return name;
	}

	public void setName(StringBuilder name) {
		this.name = name;
	}

	public StringBuilder getPosition() {
		return position;
	}

	public void setPosition(StringBuilder position) {
		this.position = position;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
