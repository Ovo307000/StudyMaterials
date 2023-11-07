package StudentInformationSystem.StudentSystem;

import StudentInformationSystem.ANSI.ANSI;
import StudentInformationSystem.Enums.EmailEnums;
import StudentInformationSystem.Enums.LevelEnums;
import StudentInformationSystem.Person.Student;

import java.util.ArrayList;

public class StudentSystem
{
	private static final ArrayList<Student> students = new ArrayList<Student>();

	private StudentSystem() {}

	public static void initialization()
	{
		students.add(
				new Student("张三", 18, LevelEnums.LEVEL_8.getAbbreviation(), EmailEnums.AOL.getEmailAddress("1919810"),
				            "北京市朝阳区", "1145141919810", 86));
		students.add(new Student("李四", 19, LevelEnums.LEVEL_9.getAbbreviation(),
		                         EmailEnums.HOTMAIL.getEmailAddress("114514"), "北京市海淀区", "1919810114514", 100));
		students.add(new Student("王五", 20, LevelEnums.LEVEL_7.getAbbreviation(),
		                         EmailEnums.YAHOO.getEmailAddress("114514"), "北京市西城区", "1145141919810", 100));
		students.add(new Student("赵六", 21, LevelEnums.LEVEL_6.getAbbreviation(),
		                         EmailEnums.YAHOO.getEmailAddress("1919810"), "北京市东城区", "1919810114514", 100));
		students.add(new Student("孙七", 22, LevelEnums.LEVEL_5.getAbbreviation(),
		                         EmailEnums.YAHOO.getEmailAddress("114514"), "北京市朝阳区", "1145141919810", 100));
	}

	public static void addStudent()
	{
		students.add(
				new Student(GetInformation.getName(), GetInformation.getAge(), GetInformation.getLevel(), GetInformation.getEmail(), GetInformation.getAddress(), GetInformation.getPhoneNumber(), GetInformation.getScore()));

		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		System.out.println("Student added successfully!");

		for (Student student : students)
		{
			System.out.println(student.toString());
		}
		System.out.println(ANSI.Reset.RESET);
	}

}
