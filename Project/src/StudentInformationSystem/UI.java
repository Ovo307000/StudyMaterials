package StudentInformationSystem;

public class UI
{
	private UI() {}

	public static void printInputPrompt()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.BLUE);
		System.out.print("Please enter your input: ");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printInputPrompt(int red, int green, int blue)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.print("Please enter your input: ");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printInputPrompt(int min, int max)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.print("Please enter your input: ");
		System.out.println(ANSI.Reset.RESET);
	}


	public static void printHeader()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.YELLOW);
		System.out.println("====================================");
		System.out.println("= Student Information System       =");
		System.out.println("====================================");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printHeader(int red, int green, int blue)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.println("====================================");
		System.out.println("= Student Information System       =");
		System.out.println("====================================");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printHeader(int min, int max)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.println("====================================");
		System.out.println("= Student Information System       =");
		System.out.println("====================================");
		System.out.println(ANSI.Reset.RESET);
	}


	public static void printMainMenu()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.YELLOW);
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Students                      |");
		System.out.println("| 2. Teachers                      |");
		System.out.println("| 3. Exit                          |");
		System.out.println("+----------------------------------+");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printMainMenu(int red, int green, int blue)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Students                      |");
		System.out.println("| 2. Teachers                      |");
		System.out.println("| 3. Exit                          |");
		System.out.println("+----------------------------------+");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printMainMenu(int min, int max)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Students                      |");
		System.out.println("| 2. Teachers                      |");
		System.out.println("| 3. Exit                          |");
		System.out.println("+----------------------------------+");
		System.out.println(ANSI.Reset.RESET);
	}


	public static void printStudentMenu()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.YELLOW);
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Student                   |");
		System.out.println("| 2. Remove Student                |");
		System.out.println("| 3. Update Student                |");
		System.out.println("| 4. List Students                 |");
		System.out.println("| 5. Back                          |");
		System.out.println("+----------------------------------+");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printStudentMenu(int red, int green, int blue)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.otherColor(red, green, blue));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Student                   |");
		System.out.println("| 2. Remove Student                |");
		System.out.println("| 3. Update Student                |");
		System.out.println("| 4. List Students                 |");
		System.out.println("| 5. Back                          |");
		System.out.println("+----------------------------------+");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printStudentMenu(int min, int max)
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(min, max));
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Student                   |");
		System.out.println("| 2. Remove Student                |");
		System.out.println("| 3. Update Student                |");
		System.out.println("| 4. List Students                 |");
		System.out.println("| 5. Back                          |");
		System.out.println("+----------------------------------+");
		System.out.println(ANSI.Reset.RESET);
	}

	public static void printTeacherMenu()
	{
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Teacher                   |");
		System.out.println("| 2. Remove Teacher                |");
		System.out.println("| 3. Update Teacher                |");
		System.out.println("| 4. List Teachers                 |");
		System.out.println("| 5. Back                          |");
		System.out.println("+----------------------------------+");

		System.out.println("====================================");
		System.out.println("= Please select an option:         =");
		System.out.println("====================================");
	}

	public static void printTeacherMenu(int red, int green, int blue)
	{
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Teacher                   |");
		System.out.println("| 2. Remove Teacher                |");
		System.out.println("| 3. Update Teacher                |");
		System.out.println("| 4. List Teachers                 |");
		System.out.println("| 5. Back                          |");
		System.out.println("+----------------------------------+");

		System.out.println("====================================");
		System.out.println("= Please select an option:         =");
		System.out.println("====================================");
	}

	public static void printTeacherMenu(int min, int max)
	{
		System.out.println("+----------------------------------+");
		System.out.println("| 1. Add Teacher                   |");
		System.out.println("| 2. Remove Teacher                |");
		System.out.println("| 3. Update Teacher                |");
		System.out.println("| 4. List Teachers                 |");
		System.out.println("| 5. Back                          |");
		System.out.println("+----------------------------------+");

		System.out.println("====================================");
		System.out.println("= Please select an option:         =");
		System.out.println("====================================");
	}
}
