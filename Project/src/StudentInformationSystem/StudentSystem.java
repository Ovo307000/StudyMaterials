package StudentInformationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem
{
	private static final ArrayList<Student> students = new ArrayList<Student>();

	private StudentSystem() {}

	private static Scanner getScanner()
	{
		return new Scanner(System.in);
	}


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
		String name = getScanner().nextLine();
		System.out.print(ANSI.Reset.RESET);

		return name;
	}

	public static int getAge()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's age: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		int age = getScanner().nextInt();
		System.out.print(ANSI.Reset.RESET);

		return age;
	}

	public static String getLevel()
	{
		boolean validChoice = false;
		int     userChoice  = - 1;

		while (! validChoice)
		{
			for (int i = 0; i < StudentLevelEnums.values().length; i++)
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println((i + 1) + ". " + StudentLevelEnums.values()[i].getAbbreviation());
			}
			System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
			System.out.print("Please choose the student's level: ");
			System.out.print(ANSI.Reset.RESET);

			userChoice = getScanner().nextInt();

			// 对用户输入进行检查
			if (userChoice >= 1 && userChoice <= StudentLevelEnums.values().length)
			{
				validChoice = true;
			}
			else
			{
				System.err.print("Invalid input! Please try again.");
			}
		}
		StudentLevelEnums selectedLevel = StudentLevelEnums.values()[userChoice - 1];

		return selectedLevel.getAbbreviation();
	}

	private static String getEmailHead()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's email head: ");
		String emailHead = getScanner().nextLine();
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print(ANSI.Reset.RESET);

		return emailHead;
	}

	private static String getEmailTall()
	{
		for (int i = 0; i < EmailEnums.values().length; i++)
		{
			System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.println((i + 1) + ". " + EmailEnums.values()[i].getDomain());
		}

		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please choose the student's email tall: ");
		int    choose    = getScanner().nextInt();
		String emailTall = EmailEnums.values()[choose - 1].toString();
		System.out.print(ANSI.Reset.RESET);

		return emailTall;
	}

	public static String getEmail()
	{
		return getEmailHead() + "@" + getEmailTall();
	}

	public static String getAddress()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's address: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String address = getScanner().nextLine();

		System.out.print(ANSI.Reset.RESET);

		return address;
	}

	public static String getPhoneNumber()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's phone number: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String phoneNumber = getScanner().nextLine();

		System.out.print(ANSI.Reset.RESET);

		return phoneNumber;
	}

	public static int getScore()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's score: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		int score = getScanner().nextInt();

		System.out.print(ANSI.Reset.RESET);

		return score;
	}
}
