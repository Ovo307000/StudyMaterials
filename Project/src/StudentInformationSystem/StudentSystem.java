package StudentInformationSystem;

import java.util.Scanner;

public class StudentSystem
{
	private static Scanner in = new Scanner(System.in);

	private StudentSystem() {}


	public static void addStudent(Student student)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
	}

	public static String getName()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.println("Please enter the student's name: ");
		System.out.println(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());
		String name = in.nextLine();
		System.out.println(ANSI.Reset.RESET);

		return name;
	}

	public static int getAge()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.println("Please enter the student's age: ");
		System.out.println(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());
		int age = in.nextInt();
		System.out.println(ANSI.Reset.RESET);

		return age;
	}

	public static StudentLevel getLevel()
	{
		boolean validChoice = false;
		int     userChoice  = - 1;

		while (! validChoice)
		{
			// 设置控制台样式
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
			System.out.println("Please choose the student's level: ");
			System.out.println(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

			// 输出学生级别选项
			for (int i = 0; i < StudentLevel.values().length; i++)
			{
				System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
				System.out.println((i + 1) + ". " + StudentLevel.values()[i].getAbbreviation());
			}
			System.out.println(ANSI.Reset.RESET);

			// 获取用户选择
			userChoice = in.nextInt();

			if (userChoice >= 1 && userChoice <= StudentLevel.values().length)
			{
				validChoice = true;
			}
			else
			{
				System.err.println("Invalid input! Please try again.");
			}
		}

		StudentLevel selectedLevel = StudentLevel.values()[userChoice - 1];

		return selectedLevel;
	}

	public static String getEmail()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.println("Please enter the student's email: ");
		System.out.println(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		String email = in.nextLine();

		System.out.println(ANSI.Reset.RESET);

		return email;
	}

	public static String getAddress()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.println("Please enter the student's address: ");
		System.out.println(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		String address = in.nextLine();

		System.out.println(ANSI.Reset.RESET);

		return address;
	}

	public static String getPhoneNumber()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.println("Please enter the student's phone number: ");
		System.out.println(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		String phoneNumber = in.nextLine();

		System.out.println(ANSI.Reset.RESET);

		return phoneNumber;
	}

	public static int getScore()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.println("Please enter the student's score: ");
		System.out.println(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		int score = in.nextInt();

		System.out.println(ANSI.Reset.RESET);

		return score;
	}
}
