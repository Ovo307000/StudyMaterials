package ShopMangement.System;

import ShopMangement.Person.Employee;
import ShopMangement.Person.RandomInformationGenerator;

import java.util.ArrayList;

public class EmployeeData
{
	public static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void initRandomEmployees(int count)
	{
		for (int i = 0; i < count; i++)
		{
			employees.add(
					new Employee(RandomInformationGenerator.getRandomName(),
					             RandomInformationGenerator.getRandomAge(),
					             RandomInformationGenerator.getRandomAddress(),
					             RandomInformationGenerator.getRandomPhone(),
					             RandomInformationGenerator.getRandomEmail(),
					             RandomInformationGenerator.getRandomPassword(),
					             RandomInformationGenerator.getRandomSalary(),
					             RandomInformationGenerator.getRandomDateOfJoining(),
					             RandomInformationGenerator.getRandomPosition(),
					             RandomInformationGenerator.getRandomAccount()));
		}
	}

	public static void addEmployee()
	{

	}
}
