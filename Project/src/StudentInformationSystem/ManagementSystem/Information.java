package StudentInformationSystem.ManagementSystem;

import StudentInformationSystem.APIs.ANSI;
import StudentInformationSystem.APIs.MyScanner;
import StudentInformationSystem.Enums.EmailEnums;

public class Information
{
	private Information() {}

	public static String getName()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's name: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		String name = MyScanner.getScanner()
		                       .nextLine();
		System.out.print(ANSI.Reset.RESET);

		return name;
	}

	public static int getAge()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's age: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		int age = MyScanner.getScanner()
		                   .nextInt();
		System.out.print(ANSI.Reset.RESET);

		return age;
	}

	private static String getEmailHead()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's email head: ");
		String emailHead = MyScanner.getScanner()
		                            .nextLine();
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print(ANSI.Reset.RESET);

		return emailHead;
	}

	private static String getEmailTall()
	{
		boolean validChoice = false;
		int     userChoice  = - 1;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.println("Please choose the student's email tall: ");

			for (int i = 0; i < EmailEnums.values().length; i++)
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println((i + 1) + ". " + EmailEnums.values()[i].getDomain());
			}

			userChoice = MyScanner.getScanner()
			                      .nextInt();

			if (userChoice >= 1 && userChoice <= EmailEnums.values().length)
			{
				validChoice = true;
			}
			else
			{
				System.err.print("Invalid input! Please try again.");
			}
		}

		return EmailEnums.values()[userChoice - 1].getDomain();
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

		String address = MyScanner.getScanner()
		                          .nextLine();

		System.out.print(ANSI.Reset.RESET);

		return address;
	}

	public static String getPhoneNumber()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's phone number: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String phoneNumber = MyScanner.getScanner()
		                              .nextLine();

		System.out.print(ANSI.Reset.RESET);

		return phoneNumber;
	}
}
