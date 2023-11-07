package StudentInformationSystem.StudentSystem;

import StudentInformationSystem.ANSI.ANSI;
import StudentInformationSystem.Person.Student;
import StudentInformationSystem.UI.MenuChoose;

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

		MenuChoose.studentMenu();
	}

	public static int getStudentCount()
	{
		return students.size();
	}
}