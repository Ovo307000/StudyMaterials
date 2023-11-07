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
		students.add(
				new Student(getName(), getAge(), getLevel(), getEmail(), getAddress(), getPhoneNumber(), getScore()));

		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		System.out.println("Student added successfully!");

		for (Student student : students)
		{
			System.out.println(student.toString());
		}
		System.out.println(ANSI.Reset.RESET);
	}

	public static String getName()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's name: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		String name = in.nextLine();
		System.out.print(ANSI.Reset.RESET);

		return name;
	}

	public static int getAge()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's age: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
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
			System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
			System.out.print("Please choose the student's level: ");
			System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

			// 输出学生级别选项
			for (int i = 0; i < StudentLevel.values().length; i++)
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));

				if (i == 0)
				{
					System.out.println();
				}

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
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's email: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		in.next();
		String email = in.nextLine();

		System.out.print(ANSI.Reset.RESET);

		return email;
	}

	public static String getAddress()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's address: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String address = in.nextLine();

		System.out.print(ANSI.Reset.RESET);

		return address;
	}

	public static String getPhoneNumber()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's phone number: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String phoneNumber = in.nextLine();

		System.out.print(ANSI.Reset.RESET);

		return phoneNumber;
	}

	public static int getScore()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's score: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		int score = in.nextInt();

		System.out.print(ANSI.Reset.RESET);

		return score;
	}
}
