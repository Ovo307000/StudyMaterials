package ShopMangement.Person;

import ShopMangement.API.ISecureRandom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RandomInformationGenerator
{
	public static String getRandomName()
	{
		ArrayList<String> firstNames = new ArrayList<String>(
				Arrays.asList("James", "John", "Robert", "Michael", "William", "David", "Richard", "Charles", "Joseph",
				              "Thomas"));
		ArrayList<String> lastNames = new ArrayList<String>(
				Arrays.asList("Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia",
				              "Rodriguez", "Wilson"));

		return STR."\{firstNames.get(ISecureRandom.secureRandom()
		                                          .nextInt(firstNames.size()))} \{lastNames.get(
				                                                                                   ISecureRandom.secureRandom()
				                                                                                                .nextInt(lastNames.size()))
		                                                                                   .toLowerCase()}";
	}

	public static int getRandomAge()
	{
		return ISecureRandom.secureRandom()
		                    .nextInt(18, 60);
	}

	public static String getRandomAddress()
	{
		ArrayList<String> addresses = new ArrayList<>(Arrays.asList("New York", "Los Angeles", "Chicago", "Houston",
		                                                            "Phoenix", "Philadelphia", "San Antonio",
		                                                            "San Diego", "Dallas", "San Jose"));

		return addresses.get(ISecureRandom.secureRandom()
		                                  .nextInt(addresses.size()));
	}

	public static String getRandomPhone()
	{
		return STR."\{ISecureRandom.secureRandom()
		                           .nextInt(100, 999)}-\{ISecureRandom.secureRandom()
		                                                              .nextInt(100, 999)}-\{ISecureRandom.secureRandom()
		                                                                                                 .nextInt(1000,
		                                                                                                          9999)}";
	}

	public static String getRandomEmail()
	{
		int length = ISecureRandom.secureRandom()
		                          .nextInt(6, 12);

		EmailEnums[]  emailEnums = EmailEnums.values();
		char[]        code       = new char[62];
		StringBuilder head       = new StringBuilder();

		// 创建ANSI码表
		int index = 0;
		for (char c = '0'; c <= '9'; c++)
		{
			code[index++] = c;
		}

		for (char c = 'a'; c <= 'z'; c++)
		{
			code[index++] = c;
		}

		for (char c = 'A'; c <= 'Z'; c++)
		{
			code[index++] = c;
		}

		for (int i = 0; i < length; i++)
		{
			head.append(code[ISecureRandom.secureRandom()
			                              .nextInt(code.length)]);
		}

		return STR."\{head.toString()}@\{emailEnums[ISecureRandom.secureRandom()
		                                                         .nextInt(emailEnums.length)]
				.getSuffix()}";
	}

	public static String getRandomPassword()
	{
		return Utils.getRandomString();
	}

	public static String getRandomSalary()
	{
		return STR."\{ISecureRandom.secureRandom()
		                           .nextInt(3000, 100000)}";
	}

	public static String getRandomDateOfJoining()
	{
		return Utils.getRandomDate();
	}

	public static PositionEnums getRandomPosition()
	{
		return PositionEnums.values()[ISecureRandom.secureRandom()
		                                           .nextInt(PositionEnums.values().length)];
	}

	public static String getRandomAccount()
	{
		return Utils.getRandomString();
	}

	public static class Utils
	{
		private Utils() {}


		public static String getRandomString()
		{
			int length = ISecureRandom.secureRandom()
			                          .nextInt(6, 12);
			char[]        code         = new char[62];
			StringBuilder randomString = new StringBuilder();

			// 创建ANSI码表
			int index = 0;
			for (char c = '0'; c <= '9'; c++)
			{
				code[index++] = c;
			}

			for (char c = 'a'; c <= 'z'; c++)
			{
				code[index++] = c;
			}

			for (char c = 'A'; c <= 'Z'; c++)
			{
				code[index++] = c;
			}

			for (int i = 0; i < length; i++)
			{
				randomString.append(code[ISecureRandom.secureRandom()
				                                      .nextInt(code.length)]);
			}

			return randomString.toString();
		}

		public static String getRandomDate()
		{
			LocalDate minDate = LocalDate.EPOCH;
			LocalDate maxDate = LocalDate.now();

			int days = minDate.until(maxDate)
			                  .getDays();


			LocalDate date = minDate.plusDays(ISecureRandom.secureRandom()
			                                               .nextInt(days));

			return date.toString();
		}
	}
}

