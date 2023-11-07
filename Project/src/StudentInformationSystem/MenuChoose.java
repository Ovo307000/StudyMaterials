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

			switch (choose)
			{
				case "1" ->
				{
					UI.printStudentMenu(200, 255);
					validChoice = true;
				}
				case "2" ->
				{
					UI.printTeacherMenu(200, 255);
					validChoice = true;
				}

				case "3" ->
				{
					UI.printCourseMenu(200, 255);
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
