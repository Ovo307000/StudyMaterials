package StudentInformationSystem;

import java.util.Scanner;

public class MenuChoose
{
	private static Scanner in = new Scanner(System.in);

	public static void mainMenu()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			String choose = in.next();
			validChoice = false;

			switch (choose)
			{
				case "1" ->
				{
					UI.printStudentMenu(200, 255);
					MenuChoose.studentMenu();
					validChoice = true;
				}
				case "2" ->
				{
					UI.printTeacherMenu(200, 255);
					MenuChoose.teacherMenu();
					validChoice = true;
				}

				case "3" ->
				{
					UI.printExitMessage(200, 255);
					validChoice = true;
					System.exit(0);
				}

				default ->
				{
					System.err.println("Invalid input, please try again.");
					validChoice = false;
				}
			}
		}
	}

	public static void studentMenu()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			String choose = in.next();

			switch (choose)
			{
				case "1" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.print("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "2" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.println("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "3" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.println("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "4" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.println("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "5" ->
				{
					UI.printMainMenu(200, 255);
					MenuChoose.mainMenu();
					validChoice = true;
				}

				default ->
				{
					System.err.println("Invalid input, please try again.");
					validChoice = false;
				}
			}
		}
	}

	public static void teacherMenu()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			String choose = in.next();

			switch (choose)
			{
				case "1" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.println("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "2" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.println("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "3" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.println("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "4" ->
				{
					System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
					System.out.println("Being developed...");
					System.out.print(ANSI.Reset.RESET);
					validChoice = true;
				}

				case "5" ->
				{
					UI.printMainMenu(200, 255);
					MenuChoose.mainMenu();
					validChoice = true;
				}

				default ->
				{
					System.err.println("Invalid input, please try again.");
					validChoice = false;
				}
			}
		}
	}
}
