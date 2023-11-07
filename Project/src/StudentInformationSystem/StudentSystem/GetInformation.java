package StudentInformationSystem.StudentSystem;

import StudentInformationSystem.ANSI.ANSI;
import StudentInformationSystem.Enums.EmailEnums;
import StudentInformationSystem.Enums.LevelEnums;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GetInformation
{
	private GetInformation() {}


	private static Scanner getScanner()
	{
		return new Scanner(System.in);
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
			for (int i = 0; i < LevelEnums.values().length; i++)
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println((i + 1) + ". " + LevelEnums.values()[i].getAbbreviation());
			}
			System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
			System.out.print("Please choose the student's level: ");
			System.out.print(ANSI.Reset.RESET);

			userChoice = getScanner().nextInt();

			// 对用户输入进行检查
			if (userChoice >= 1 && userChoice <= LevelEnums.values().length)
			{
				validChoice = true;
			}
			else
			{
				System.err.print("Invalid input! Please try again.");
			}
		}
		LevelEnums selectedLevel = LevelEnums.values()[userChoice - 1];

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

	public static Random getRandom()
	{
		SecureRandom secureRandom = new SecureRandom();
		long         seed         = secureRandom.nextLong();
		return new Random(seed);
	}

	public static String getRandomEmail()
	{
		ArrayList<EmailEnums> emails = new ArrayList<EmailEnums>();
		emails.addAll(Arrays.asList(EmailEnums.values()));

		String emailHead = getRandom().ints(1, 1000000000)
		                              .toString();
		String emailTail = emails.get(getRandom().nextInt(emails.size()))
		                         .getEmailAddress(emailHead);

		return emailHead + emailTail;
	}

	public static String getRandomLevel()
	{
		ArrayList<LevelEnums> levels = new ArrayList<LevelEnums>();
		levels.addAll(Arrays.asList(LevelEnums.values()));

		return levels.get(getRandom().nextInt(levels.size()))
		             .getAbbreviation();
	}

	public static String getRandomPhoneNumber()
	{
		String phoneNumberHead = getRandom().longs(100, 199)
		                                    .toString();
		String phoneNumberTail = getRandom().longs(10000000, 99999999)
		                                    .toString();

		return phoneNumberHead + phoneNumberTail;
	}

	public static int getRandomScore()
	{
		return getRandom().nextInt(100);
	}

	public static int getRandomAge()
	{
		return getRandom().nextInt(18, 25);
	}
}
