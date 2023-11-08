package StudentInformationSystem.UI;

import StudentInformationSystem.APIs.ANSI;
import StudentInformationSystem.StudentSystem.StudentSystem;
import StudentInformationSystem.TeacherSystem.TeacherSystem;

import java.util.Scanner;

public class MenuChoose
{
	private static final Scanner in = new Scanner(System.in);

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
					UI.printInputPrompt(200, 255);
					validChoice = true;
				}
				case "2" ->
				{
					UI.printTeacherMenu(200, 255);
					MenuChoose.teacherMenu();
					UI.printInputPrompt(200, 255);
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
					System.err.println("Invalid input, please try again.");
					validChoice = false;
				}
			}
		}
	}
}
