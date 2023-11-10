package StudentInformationSystem.StudentSystem;

import StudentInformationSystem.APIs.ANSI;
import StudentInformationSystem.APIs.MyScanner;
import StudentInformationSystem.ManagementSystem.RandomInformation;
import StudentInformationSystem.Person.Student;
import StudentInformationSystem.UI.MenuChoose;
import StudentInformationSystem.UI.UI;

import java.util.ArrayList;

public class StudentSystem
{
	public static final ArrayList<Student> students = new ArrayList<Student>();

	private StudentSystem() {}

	public static void initialization(int count)
	{
		for (int i = 0; i < count; i++)
		{
			students.add(new Student(RandomInformation.getRandomName(), RandomInformation.getRandomAge(),
			                         StudentInformationSystem.StudentSystem.RandomInformation.getRandomLevel(),
			                         RandomInformation.getRandomEmail(), RandomInformation.getRandomAddress(),
			                         RandomInformation.getRandomPhoneNumber(),
			                         StudentInformationSystem.StudentSystem.RandomInformation.getRandomScore()));
		}
	}

	public static void addStudent()
	{
		Student addedStudent = new Student(StudentInformationSystem.ManagementSystem.Information.getName(),
		                                   StudentInformationSystem.ManagementSystem.Information.getAge(),
		                                   Information.getLevel(),
		                                   StudentInformationSystem.ManagementSystem.Information.getEmail(),
		                                   StudentInformationSystem.ManagementSystem.Information.getAddress(),
		                                   StudentInformationSystem.ManagementSystem.Information.getPhoneNumber(),
		                                   Information.getScore());

		if (students.add(addedStudent))
		{
			System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.println(addedStudent.getName() + " added successfully!");
			System.out.print(ANSI.Reset.RESET);
		}
		else
		{
			System.err.println("Failed to add " + addedStudent.getName() + "!");
		}


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

			int id = MyScanner.getScanner()
			                  .nextInt();
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

	public static void printAllStudents()
	{
		for (Student student : students)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.println(student.getInformation());
		}

		System.out.println(ANSI.Reset.RESET);

		UI.printStudentMenu(200, 255);
		MenuChoose.studentMenu();
	}

	public static void printAllStudentsCount()
	{
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		System.out.println("There are " + students.size() + " students in the system.");
		System.out.print(ANSI.Reset.RESET);

		UI.printStudentMenu(200, 255);
		MenuChoose.studentMenu();
	}

	public static void findStudentById()
	{
		boolean validChoice = false;

		while (! validChoice)
		{
			System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
			System.out.print("Please enter the student's id: ");
			System.out.print(ANSI.Reset.RESET);

			int id = MyScanner.getScanner()
			                  .nextInt();
			id = id - 1;

			if (id >= 0 && id < students.size())
			{
				Student foundStudent = students.get(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(foundStudent.getInformation());
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

			int id = MyScanner.getScanner()
			                  .nextInt();
			id = id - 1;

			if (id >= 0 && id < students.size())
			{
				Student modifiedStudent = students.get(id);

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(modifiedStudent.getInformation());
				System.out.print(ANSI.Reset.RESET);

				System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println("Please enter the student's new information: ");
				System.out.print(ANSI.Reset.RESET);

				modifiedStudent.setName(StudentInformationSystem.ManagementSystem.Information.getName());
				modifiedStudent.setAge(StudentInformationSystem.ManagementSystem.Information.getAge());
				modifiedStudent.setLevel(Information.getLevel());
				modifiedStudent.setEmail(StudentInformationSystem.ManagementSystem.Information.getEmail());
				modifiedStudent.setAddress(StudentInformationSystem.ManagementSystem.Information.getAddress());
				modifiedStudent.setPhoneNumber(StudentInformationSystem.ManagementSystem.Information.getPhoneNumber());
				modifiedStudent.setScore(Information.getScore());

				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
				System.out.println(modifiedStudent.getName() + " has been modified.");
				System.out.println(modifiedStudent.getInformation());
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