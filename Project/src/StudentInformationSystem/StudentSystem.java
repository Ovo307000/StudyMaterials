package StudentInformationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem
{
	private static final Scanner            in       = new Scanner(System.in);
	private static final ArrayList<Student> students = new ArrayList<Student>();

	private StudentSystem() {}


	public static void addStudent()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());

		students.add(
				new Student(getName(), getAge(), getLevel(), getEmail(), getAddress(), getPhoneNumber(), getScore()));

		System.out.print("Student added successfully!");

		for (Student student : students)
		{
			System.out.println(student);
		}
	}

	public static String getName()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.print("Please enter the student's name: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());
		String name = in.nextLine();
		System.out.print(ANSI.Reset.RESET);

		return name;
	}

	public static int getAge()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.print("Please enter the student's age: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());
		int age = in.nextInt();
		System.out.print(ANSI.Reset.RESET);

		return age;
	}

	public static StudentLevel getLevel()
	{
		boolean validChoice = false;
		int     userChoice  = - 1;

		while (! validChoice)
		{
			// 设置控制台样式
			System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
			System.out.print("Please choose the student's level: ");
			System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

			// 输出学生级别选项
			for (int i = 0; i < StudentLevel.values().length; i++)
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
				System.out.println((i + 1) + ". " + StudentLevel.values()[i].getAbbreviation());
			}
			System.out.print(ANSI.Reset.RESET);

			// 获取用户选择
			userChoice = in.nextInt();

			if (userChoice >= 1 && userChoice <= StudentLevel.values().length)
			{
				validChoice = true;
			}
			else
			{
				System.err.print("Invalid input! Please try again.");
			}
		}

		StudentLevel selectedLevel = StudentLevel.values()[userChoice - 1];

		return selectedLevel;
	}

	public static String getEmail()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.print("Please enter the student's email: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		String email = in.nextLine();

		System.out.print(ANSI.Reset.RESET);

		return email;
	}

	public static String getAddress()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.print("Please enter the student's address: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		String address = in.nextLine();

		System.out.print(ANSI.Reset.RESET);

		return address;
	}

	public static String getPhoneNumber()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.print("Please enter the student's phone number: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		String phoneNumber = in.nextLine();

		System.out.print(ANSI.Reset.RESET);

		return phoneNumber;
	}

	public static int getScore()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
		System.out.print("Please enter the student's score: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor());

		int score = in.nextInt();

		System.out.print(ANSI.Reset.RESET);

		return score;
	}
}
