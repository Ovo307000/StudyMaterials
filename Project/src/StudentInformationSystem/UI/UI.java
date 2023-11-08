package StudentInformationSystem.UI;

import StudentInformationSystem.APIs.ANSI;

public class UI
{
	private UI() {}

	public static void printInputPrompt()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.BLUE);
		System.out.print("Please enter your input: ");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printInputPrompt(int red, int green, int blue)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.print("Please enter your input: ");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printInputPrompt(int min, int max)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.print("Please enter your input: ");
		System.out.print(ANSI.Reset.RESET);
	}


	public static void printWelcomeMassage()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.YELLOW);
		System.out.println("====================================");
		System.out.println("=    Student Information System    =");
		System.out.println("====================================");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printWelcomeMassage(int red, int green, int blue)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.println("====================================");
		System.out.println("= Student Information System       =");
		System.out.println("====================================");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printWelcomeMassage(int min, int max)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.println("====================================");
		System.out.println("= Student Information System       =");
		System.out.println("====================================");
		System.out.print(ANSI.Reset.RESET);
	}


	public static void printMainMenu()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.YELLOW);
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Students                      |");
		System.out.println("| 2. Teachers                      |");
		System.out.println("| 3. Exit                          |");
		System.out.println("+----------------------------------+");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printMainMenu(int red, int green, int blue)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Students                      |");
		System.out.println("| 2. Teachers                      |");
		System.out.println("| 3. Exit                          |");
		System.out.println("+----------------------------------+");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printMainMenu(int min, int max)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Students                      |");
		System.out.println("| 2. Teachers                      |");
		System.out.println("| 3. Exit                          |");
		System.out.println("+----------------------------------+");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printExitMessage()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.YELLOW);
		System.out.println("====================================");
		System.out.println("= Thank you for using this system! =");
		System.out.println("====================================");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printExitMessage(int min, int max)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.println("====================================");
		System.out.println("= Thank you for using this system! =");
		System.out.println("====================================");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printExitMessage(int red, int green, int blue)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.println("====================================");
		System.out.println("= Thank you for using this system! =");
		System.out.println("====================================");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printStudentMenu()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.YELLOW);
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Student                   |");
		System.out.println("| 2. Remove Student                |");
		System.out.println("| 3. Update Student                |");
		System.out.println("| 4. List Students                 |");
		System.out.println("| 5. Find Students                 |");
		System.out.println("| 6. Back                          |");
		System.out.println("+----------------------------------+");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printStudentMenu(int red, int green, int blue)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Student                   |");
		System.out.println("| 2. Remove Student                |");
		System.out.println("| 3. Modify Student                |");
		System.out.println("| 4. List Students                 |");
		System.out.println("| 5. Find Students                 |");
		System.out.println("| 6. Back                          |");
		System.out.println("+----------------------------------+");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printStudentMenu(int min, int max)
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Student                   |");
		System.out.println("| 2. Remove Student                |");
		System.out.println("| 3. Modify Student                |");
		System.out.println("| 4. List Students                 |");
		System.out.println("| 5. Find Students                 |");
		System.out.println("| 6. Back                          |");
		System.out.println("+----------------------------------+");
		System.out.print(ANSI.Reset.RESET);
	}

	public static void printTeacherMenu()
	{
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Teacher                   |");
		System.out.println("| 2. Remove Teacher                |");
		System.out.println("| 3. Modify Teacher                |");
		System.out.println("| 4. List Teachers                 |");
		System.out.println("| 5. Find Teachers                 |");
		System.out.println("| 6. Back                          |");
		System.out.println("+----------------------------------+");
	}

	public static void printTeacherMenu(int red, int green, int blue)
	{
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Teacher                   |");
		System.out.println("| 2. Remove Teacher                |");
		System.out.println("| 3. Modify Teacher                |");
		System.out.println("| 4. List Teachers                 |");
		System.out.println("| 5. Find Teachers                 |");
		System.out.println("| 5. Back                          |");
		System.out.println("+----------------------------------+");
	}

	public static void printTeacherMenu(int min, int max)
	{
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Teacher                   |");
		System.out.println("| 2. Remove Teacher                |");
		System.out.println("| 3. Modify Teacher                |");
		System.out.println("| 4. List Teachers                 |");
		System.out.println("| 5. Find Teachers                 |");
		System.out.println("| 6. Back                          |");
		System.out.println("+----------------------------------+");
	}
}
