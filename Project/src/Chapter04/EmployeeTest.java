package Chapter04;

import java.time.LocalDate;

public class EmployeeTest {
	public EmployeeTest() {}

	public static void main(String[] args) {
		EmployeeTest test      = new EmployeeTest();
		Employee employee = new Employee();
		Employee[]   employees = test.getEmployee();

		System.out.println("Before raiseSalary:");
		test.printEmployee(employees);

		for (int i = 0; i < employees.length; i++) {
			employees[i].raiseSalary(20.00, employees[i]);
		}
		System.out.println("After raiseSalary:");
		test.printEmployee(employees);
	}

	public Employee[] getEmployee() {
		Employee[] employees = new Employee[10];

		// 使用全参构造器生成5个随机的Employee对象
		employees[0] = new Employee(new StringBuilder("张三"),
		                            new StringBuilder("经理"),
		                            LocalDate.of(1999,
		                                         2,
		                                         13),
		                            10000.12,
		                            30);
		employees[1] = new Employee(new StringBuilder("李四"),
		                            new StringBuilder("程序员"),
		                            LocalDate.of(1986,
		                                         7,
		                                         12),
		                            12687.54,
		                            25);
		employees[2] = new Employee(new StringBuilder("王五"),
		                            new StringBuilder("程序员"),
		                            LocalDate.of(1992,
		                                         3,
		                                         23),
		                            9876.32,
		                            28);
		employees[3] = new Employee(new StringBuilder("赵六"),
		                            new StringBuilder("程序员"),
		                            LocalDate.of(1995,
		                                         4,
		                                         14),
		                            8765.43,
		                            27);
		employees[4] = new Employee(new StringBuilder("孙七"),
		                            new StringBuilder("程序员"),
		                            LocalDate.of(1998,
		                                         5,
		                                         25),
		                            7654.32,
		                            26);


		// 使用无参构造器生成5个随机的Employee对象
		employees[5] = new Employee();
		employees[5].setName(new StringBuilder("周八"));
		employees[5].setPosition(new StringBuilder("程序员"));
		employees[5].setHireDay(LocalDate.of(1997,
		                                     6,
		                                     16));
		employees[5].setSalary(6543.21);
		employees[5].setAge(25);

		employees[6] = new Employee();
		employees[6].setName(new StringBuilder("吴九"));
		employees[6].setPosition(new StringBuilder("程序员"));
		employees[6].setHireDay(LocalDate.of(1996,
		                                     7,
		                                     17));
		employees[6].setSalary(5432.10);
		employees[6].setAge(24);

		employees[7] = new Employee();
		employees[7].setName(new StringBuilder("郑十"));
		employees[7].setPosition(new StringBuilder("程序员"));
		employees[7].setHireDay(LocalDate.of(1995,
		                                     8,
		                                     18));
		employees[7].setSalary(4321.09);
		employees[7].setAge(23);

		employees[8] = new Employee();
		employees[8].setName(new StringBuilder("钱十一"));
		employees[8].setPosition(new StringBuilder("程序员"));
		employees[8].setHireDay(LocalDate.of(1994,
		                                     9,
		                                     19));
		employees[8].setSalary(3210.98);
		employees[8].setAge(22);

		employees[9] = new Employee();
		employees[9].setName(new StringBuilder("孙十二"));
		employees[9].setPosition(new StringBuilder("程序员"));
		employees[9].setHireDay(LocalDate.of(1993,
		                                     10,
		                                     20));
		employees[9].setSalary(2109.87);
		employees[9].setAge(21);

		return employees;
	}

	public void printEmployee(Employee[] employees) {
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
