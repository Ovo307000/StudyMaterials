package ShopMangement.System;

import ShopMangement.Person.Employee;

public class Check
{
	public static final int maxUsernameLength = 20;
	public static final int minUsernameLength = 6;
	public static final int maxPasswordLength = 20;
	public static final int minPasswordLength = 6;



	public static boolean isTooLong(String t)
	{
		return t.length() > maxUsernameLength;
	}

	public static boolean isTooShort(String t)
	{
		return t.length() < minUsernameLength;
	}

	public static boolean isEmpty(String t)
	{
		return t.isEmpty();
	}

	public static boolean isAccountInDatabase(String account)
	{
		for (Employee employee : EmployeeData.employees)
		{
			if (employee.getAccount()
			            .equals(account))
			{
				return true;
			}
		}

		return false;
	}

public static boolean isPasswordCorrect(String account, String password)
	{
		for (Employee employee : EmployeeData.employees)
		{
			if (employee.getAccount()
			            .equals(account))
			{
				return employee.getPassword()
				               .equals(password);
			}
		}

		return false;
	}
}
