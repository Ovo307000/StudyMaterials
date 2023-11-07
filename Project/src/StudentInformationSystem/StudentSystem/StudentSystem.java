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

	public static void initialization()
	{
		students.add(new Student("John", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市朝阳区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Jack", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市海淀区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Rose", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市东城区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Lily", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市西城区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Tom", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市丰台区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Jerry", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市石景山区",
		                         GetInformation.getRandomPhoneNumber(), GetInformation.getRandomScore()));
		students.add(new Student("Bob", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市门头沟区",
		                         GetInformation.getRandomPhoneNumber(), GetInformation.getRandomScore()));
		students.add(new Student("Alice", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市房山区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Mike", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市通州区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Mary", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市顺义区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("David", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市昌平区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Lucy", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市大兴区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Frank", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市怀柔区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
		students.add(new Student("Judy", GetInformation.getRandomAge(), GetInformation.getRandomLevel(),
		                         GetInformation.getRandomEmail(), "北京市平谷区", GetInformation.getRandomPhoneNumber(),
		                         GetInformation.getRandomScore()));
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

	public class StudentSystem
	{


	}
