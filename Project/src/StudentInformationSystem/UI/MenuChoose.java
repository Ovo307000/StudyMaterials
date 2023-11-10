package StudentInformationSystem.UI;

import StudentInformationSystem.APIs.MyScanner;
import StudentInformationSystem.StudentSystem.StudentSystem;
import StudentInformationSystem.TeacherSystem.TeacherSystem;

public class MenuChoose
{
	public static void mainMenu()
	{
		boolean validChoice = false;
		int     tryCount    = 0;

		while (! validChoice)
		{
			if (tryCount >= 3)
			{
				System.err.println("Too many invalid inputs, exiting...");
				System.exit(1);
			}

			UI.printInputPrompt(200, 255);
			String choose = MyScanner.getScanner()
			                         .next();

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
					tryCount++;
					System.err.println("Invalid input, please try again.");
				}
			}
		}
	}

	public static void studentMenu()
	{
		boolean validChoice = false;
		int     tryCount    = 0;

		while (! validChoice)
		{
			if (tryCount >= 3)
			{
				System.err.println("Too many invalid inputs, exiting...");
				System.exit(1);
			}

			UI.printInputPrompt(200, 255);
			String choose = MyScanner.getScanner()
			                         .next();


			switch (choose)
			{
				case "1" ->
				{
					StudentSystem.addStudent();
					validChoice = true;
				}

				case "2" ->
				{
					StudentSystem.removeStudent();
					validChoice = true;
				}

				case "3" ->
				{
					StudentSystem.modifyStudentById();
					validChoice = true;
				}

				case "4" ->
				{
					StudentSystem.printAllStudents();
					StudentSystem.printAllStudentsCount();
					validChoice = true;
				}

				case "5" ->
				{
					StudentSystem.findStudentById();
					validChoice = true;
				}

				case "6" ->
				{
					UI.printMainMenu(200, 255);
					MenuChoose.mainMenu();
					validChoice = true;
				}

				default ->
				{
					tryCount++;
					System.err.println("Invalid input, please try again.");
				}
			}
		}
	}

	public static void teacherMenu()
	{
		boolean validChoice = false;
		int     tryCount    = 0;

		while (! validChoice)
		{
			if (tryCount >= 3)
			{
				System.err.println("Too many invalid inputs, exiting...");
				System.exit(1);
			}

			UI.printInputPrompt(200, 255);
			String choose = MyScanner.getScanner()
			                         .next();

			switch (choose)
			{
				case "1" ->
				{
					TeacherSystem.addTeacher();
					validChoice = true;
				}

				case "2" ->
				{
					TeacherSystem.removeTeacher();
					validChoice = true;
				}

				case "3" ->
				{
					TeacherSystem.modifyTeacher();
					validChoice = true;
				}

				case "4" ->
				{
					TeacherSystem.printAllTeachers();
					TeacherSystem.printAllTeachersCount();
					validChoice = true;
				}

				case "5" ->
				{
					TeacherSystem.findTeacherById();
					validChoice = true;
				}

				case "6" ->
				{
					UI.printMainMenu(200, 255);
					MenuChoose.mainMenu();
					validChoice = true;
				}

				default ->
				{
					tryCount++;
					System.err.println("Invalid input, please try again.");
				}
			}
		}
	}
}
