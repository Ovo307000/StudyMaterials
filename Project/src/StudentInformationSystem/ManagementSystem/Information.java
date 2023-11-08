package StudentInformationSystem.ManagementSystem;

import StudentInformationSystem.APIs.ANSI;
import StudentInformationSystem.APIs.MyScanner;
import StudentInformationSystem.Enums.EmailEnums;

public class Information
{
	private Information() {}

	public static String getName()
	{
		java.lang.System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		java.lang.System.out.print("Please enter the student's name: ");
		java.lang.System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		String name = MyScanner.getScanner()
		                       .nextLine();
		java.lang.System.out.print(ANSI.Reset.RESET);

		return name;
	}

	public static int getAge()
	{
		java.lang.System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		java.lang.System.out.print("Please enter the student's age: ");
		java.lang.System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		int age = MyScanner.getScanner()
		                   .nextInt();
		java.lang.System.out.print(ANSI.Reset.RESET);

		return age;
	}

	private static String getEmailHead()
	{
		java.lang.System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		java.lang.System.out.print("Please enter the student's email head: ");
		String emailHead = MyScanner.getScanner()
		                            .nextLine();
		java.lang.System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		java.lang.System.out.print(ANSI.Reset.RESET);

		return emailHead;
	}

	private static String getEmailTall()
	{
		for (int i = 0; i < EmailEnums.values().length; i++)
		{
			java.lang.System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			java.lang.System.out.println((i + 1) + ". " + EmailEnums.values()[i].getDomain());
		}

		java.lang.System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		java.lang.System.out.print("Please choose the student's email tall: ");
		int    choose    = MyScanner.getScanner()
		                            .nextInt();
		String emailTall = EmailEnums.values()[choose - 1].toString();
		java.lang.System.out.print(ANSI.Reset.RESET);

		return emailTall;
	}

	public static String getEmail()
	{
		return getEmailHead() + "@" + getEmailTall();
	}

	public static String getAddress()
	{
		java.lang.System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		java.lang.System.out.print("Please enter the student's address: ");
		java.lang.System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String address = MyScanner.getScanner()
		                          .nextLine();

		java.lang.System.out.print(ANSI.Reset.RESET);

		return address;
	}

	public static String getPhoneNumber()
	{
		java.lang.System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		java.lang.System.out.print("Please enter the student's phone number: ");
		java.lang.System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String phoneNumber = MyScanner.getScanner()
		                              .nextLine();

		java.lang.System.out.print(ANSI.Reset.RESET);

		return phoneNumber;
	}
}
