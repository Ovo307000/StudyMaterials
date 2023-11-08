package StudentInformationSystem.StudentSystem;

import StudentInformationSystem.APIs.ANSI;
import StudentInformationSystem.APIs.MyScanner;
import StudentInformationSystem.Enums.LevelEnums;

public class Information
{
	private Information() {}

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

			userChoice = MyScanner.getScanner()
			                      .nextInt();

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

	public static int getScore()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the student's score: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		int score = MyScanner.getScanner()
		                     .nextInt();

		System.out.print(ANSI.Reset.RESET);

		return score;
	}

}
