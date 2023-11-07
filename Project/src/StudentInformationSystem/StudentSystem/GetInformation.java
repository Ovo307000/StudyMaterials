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
		ArrayList<EmailEnums> emails = new ArrayList<EmailEnums>(Arrays.asList(EmailEnums.values()));

		long emailHead = getRandom().nextLong(100000000, 999999999);
		String emailDomain = emails.get(getRandom().nextInt(emails.size()))
		                           .getDomain();

		return emailHead + "@" + emailDomain;
	}

	public static String getRandomLevel()
	{
		ArrayList<LevelEnums> levels = new ArrayList<LevelEnums>(Arrays.asList(LevelEnums.values()));

		return levels.get(getRandom().nextInt(levels.size()))
		             .getAbbreviation();
	}

	public static String getRandomPhoneNumber()
	{
		ArrayList<String> phoneNumberHead = new ArrayList<>(Arrays.asList("130", "131", "132", "133", "134", "135", "136",
		                                                                  "137", "138", "139", "150", "151", "152",
		                                                                  "153", "155", "156", "157", "158", "159",
		                                                                  "170", "171", "172", "173", "174", "175",
		                                                                  "176", "177", "178", "180", "181", "182",
		                                                                  "183", "184", "185", "186", "187", "188",
		                                                                  "189", "191", "198", "199"));
		long phoneNumberTail = getRandom().nextLong(10000000, 99999999);

		return String.valueOf(phoneNumberHead.get(getRandom().nextInt(phoneNumberHead.size())) + phoneNumberTail);
	}

	public static int getRandomScore()
	{
		return getRandom().nextInt(100);
	}

	public static int getRandomAge()
	{
		return getRandom().nextInt(18, 25);
	}

	public static String getRandomAddress()
	{
		ArrayList<String> addresses = new ArrayList<String>(
				Arrays.asList("北京市海淀区", "北京市朝阳区", "北京市丰台区", "北京市石景山区", "北京市通州区",
				              "北京市昌平区", "北京市大兴区", "北京市顺义区", "北京市房山区", "北京市门头沟区",
				              "北京市怀柔区", "北京市平谷区", "北京市密云区", "北京市延庆区"));

		return addresses.get(getRandom().nextInt(addresses.size()));
	}

	public static String getRandomName()
	{

		ArrayList<String> firstNames = new ArrayList<String>(
				Arrays.asList("赵", "钱", "孙", "李", "周", "吴", "郑", "王"));
		ArrayList<String> lastNames = new ArrayList<String>(
				Arrays.asList("一", "二", "三", "四", "五", "六", "七", "八", "九"));

		return firstNames.get(getRandom().nextInt(firstNames.size())) + lastNames.get(
				getRandom().nextInt(lastNames.size()));
	}
}
