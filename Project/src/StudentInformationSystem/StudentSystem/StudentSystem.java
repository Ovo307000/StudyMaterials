package StudentInformationSystem.StudentSystem;

import StudentInformationSystem.ANSI.ANSI;
import StudentInformationSystem.Person.Person;
import StudentInformationSystem.Person.Student;
import StudentInformationSystem.UI.MenuChoose;
import StudentInformationSystem.UI.UI;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem
{
	public static final ArrayList<Student> students = new ArrayList<Student>();

	private StudentSystem() {}

	private static Scanner getScanner()
	{
		return new Scanner(System.in);
	}

	public static void initialization(int count)
	{
		for (int i = 0; i < count; i++)
		{
			students.add(new Student(GetInformation.getRandomName(), GetInformation.getRandomAge(),
			                         GetInformation.getRandomLevel(), GetInformation.getRandomEmail(),
			                         GetInformation.getRandomAddress(), GetInformation.getRandomPhoneNumber(),
			                         GetInformation.getRandomScore()));
		}
	}

	public static void addStudent()
	{
		Student addedStudent = new Student(GetInformation.getName(), GetInformation.getAge(), GetInformation.getLevel(),
		                                   GetInformation.getEmail(), GetInformation.getAddress(),
		                                   GetInformation.getPhoneNumber(), GetInformation.getScore());

		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		System.out.println(addedStudent.getName() + " added successfully!");
		System.out.print(ANSI.Reset.RESET);

		UI.printStudentMenu(200, 255);
		MenuChoose.studentMenu();
	}

	public static void removeStudent()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.print("Please enter the student's id: ");
			System.out.print(ANSI.Reset.RESET);

			int id = getScanner().nextInt();
			id = id - 1;

			if (id >= 0 && id < students.size())
			{
				Student removedStudent = students.get(id);
				students.remove(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(removedStudent.getName() + " has been removed.");
				System.out.print(ANSI.Reset.RESET);

				UI.printStudentMenu(200, 255);
				MenuChoose.studentMenu();

				validChoice = true;
			}
			else
			{
				System.err.println("Invalid id, please try again.");
			}
		}
	}

	public static void printStudents()
	{
		for (Student student : students)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.println(student.toString());
		}

		System.out.println(ANSI.Reset.RESET);

		UI.printStudentMenu(200, 255);
		MenuChoose.studentMenu();
	}

	public static int getStudentCount()
	{
		return students.size();
	}

	public static void findStudentById()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.print("Please enter the student's id: ");
			System.out.print(ANSI.Reset.RESET);

			int id = getScanner().nextInt();
			id = id - 1;

			if (id >= 0 && id < students.size())
			{
				Student foundStudent = students.get(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(foundStudent.toString());
				System.out.print(ANSI.Reset.RESET);

				UI.printStudentMenu(200, 255);
				MenuChoose.studentMenu();

				validChoice = true;
			}
			else
			{
				System.err.println("Invalid id, please try again.");
			}
		}
	}

	public static void modifyStudentById()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.print("Please enter the student's id: ");
			System.out.print(ANSI.Reset.RESET);

			int id = getScanner().nextInt();
			id = id - 1;

			if (id >= 0 && id < students.size())
			{
				Student modifiedStudent = students.get(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(modifiedStudent.toString());
				System.out.print(ANSI.Reset.RESET);

				System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println("Please enter the student's new information: ");
				System.out.print(ANSI.Reset.RESET);

				modifiedStudent.setName(GetInformation.getName());
				modifiedStudent.setAge(GetInformation.getAge());
				modifiedStudent.setLevel(GetInformation.getLevel());
				modifiedStudent.setEmail(GetInformation.getEmail());
				modifiedStudent.setAddress(GetInformation.getAddress());
				modifiedStudent.setPhoneNumber(GetInformation.getPhoneNumber());
				modifiedStudent.setScore(GetInformation.getScore());

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(modifiedStudent.getName() + " has been modified.");
				System.out.println(modifiedStudent.toString());
				System.out.print(ANSI.Reset.RESET);

				UI.printStudentMenu(200, 255);
				MenuChoose.studentMenu();

				validChoice = true;
			}
			else
			{
				System.err.println("Invalid id, please try again.");
			}
		}
	}
}