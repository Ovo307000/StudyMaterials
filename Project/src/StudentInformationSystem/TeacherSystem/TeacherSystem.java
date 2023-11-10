package StudentInformationSystem.TeacherSystem;

import StudentInformationSystem.APIs.ANSI;
import StudentInformationSystem.ManagementSystem.Information;
import StudentInformationSystem.ManagementSystem.RandomInformation;
import StudentInformationSystem.Person.Teacher;
import StudentInformationSystem.UI.MenuChoose;
import StudentInformationSystem.UI.UI;

import java.util.ArrayList;

public class TeacherSystem
{
	public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();

	private TeacherSystem() {}

	public static void initialization(int count)
	{
		for (int i = 0; i < count; i++)
		{
			teachers.add(new Teacher(RandomInformation.getRandomName(), RandomInformation.getRandomAge(),
			                         RandomInformation.getRandomAddress(), RandomInformation.getRandomPhoneNumber(),
			                         RandomInformation.getRandomEmail(),
			                         StudentInformationSystem.TeacherSystem.RandomInformation.getRandomSalary(),
			                         StudentInformationSystem.TeacherSystem.RandomInformation.getRandomSubject()));
		}
	}

	public static void addTeacher()
	{
		Teacher addedteacher = new Teacher(StudentInformationSystem.ManagementSystem.Information.getName(),
		                                   StudentInformationSystem.ManagementSystem.Information.getAge(),
		                                   StudentInformationSystem.ManagementSystem.Information.getAddress(),
		                                   StudentInformationSystem.ManagementSystem.Information.getPhoneNumber(),
		                                   StudentInformationSystem.ManagementSystem.Information.getEmail(),
		                                   StudentInformationSystem.TeacherSystem.Information.getSalary(),
		                                   StudentInformationSystem.TeacherSystem.Information.getSubject());

		teachers.add(addedteacher);

		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		System.out.println(addedteacher.getName() + " added successfully!");
		System.out.print(ANSI.Reset.RESET);

		UI.printTeacherMenu(200, 255);
		MenuChoose.teacherMenu();
	}

	public static void removeTeacher()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.print("Please enter the teacher's id: ");
			System.out.print(ANSI.Reset.RESET);

			int id = StudentInformationSystem.APIs.MyScanner.getScanner()
			                                                .nextInt();
			id = id - 1;

			if (id >= 0 && id < teachers.size())
			{
				Teacher removedTeacher = teachers.get(id);
				teachers.remove(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(removedTeacher.getName() + " removed successfully!");
				System.out.print(ANSI.Reset.RESET);

				UI.printTeacherMenu(200, 255);
				MenuChoose.teacherMenu();

				validChoice = true;
			}
			else
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.err.println("Invalid choice!");
				System.out.print(ANSI.Reset.RESET);
			}
		}
	}

	public static void findTeacherById()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.print("Please enter the teacher's id: ");
			System.out.print(ANSI.Reset.RESET);

			int id = StudentInformationSystem.APIs.MyScanner.getScanner()
			                                                .nextInt();
			id = id - 1;

			if (id >= 0 && id < teachers.size())
			{
				Teacher foundTeacher = teachers.get(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(foundTeacher.getInformation());
				System.out.print(ANSI.Reset.RESET);

				UI.printTeacherMenu(200, 255);
				MenuChoose.teacherMenu();

				validChoice = true;
			}
			else
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.err.println("Invalid choice!");
				System.out.print(ANSI.Reset.RESET);
			}
		}
	}

	public static void modifyTeacher()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.print("Please enter the teacher's id: ");
			System.out.print(ANSI.Reset.RESET);

			int id = StudentInformationSystem.APIs.MyScanner.getScanner()
			                                                .nextInt();
			id = id - 1;

			if (id >= 0 && id < teachers.size())
			{
				Teacher modifiedTeacher = teachers.get(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(modifiedTeacher.getInformation());
				System.out.print(ANSI.Reset.RESET);

				System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println("Please enter the new information: ");
				System.out.print(ANSI.Reset.RESET);

				modifiedTeacher.setName(Information.getName());
				modifiedTeacher.setAge(Information.getAge());
				modifiedTeacher.setAddress(Information.getAddress());
				modifiedTeacher.setPhoneNumber(Information.getPhoneNumber());
				modifiedTeacher.setEmail(Information.getEmail());
				modifiedTeacher.setSalary(StudentInformationSystem.TeacherSystem.Information.getSalary());
				modifiedTeacher.setSubject(StudentInformationSystem.TeacherSystem.Information.getSubject());

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(modifiedTeacher.getInformation());
				System.out.print(ANSI.Reset.RESET);

				UI.printTeacherMenu(200, 255);
				MenuChoose.teacherMenu();

				validChoice = true;
			}
			else
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.err.println("Invalid choice!");
				System.out.print(ANSI.Reset.RESET);
			}
		}
	}

	public static void printAllTeachers()
	{
		for (Teacher teacher : teachers)
		{
			System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.println(teacher.getInformation());
			System.out.print(ANSI.Reset.RESET);
		}

		UI.printTeacherMenu(200, 255);
		MenuChoose.teacherMenu();
	}
}
