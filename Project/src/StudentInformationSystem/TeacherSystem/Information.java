package StudentInformationSystem.TeacherSystem;

import StudentInformationSystem.APIs.ANSI;
import StudentInformationSystem.APIs.MyScanner;

public class Information
{
	private Information() {}

	public static int getSalary()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the teacher's salary: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		int salary = MyScanner.getScanner().nextInt();

		return salary;
	}

	public static String getSubject()
	{
		System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(175, 255));
		System.out.print("Please enter the teacher's subject: ");
		System.out.print(ANSI.ConsoleFontStyle.ITALIC + ANSI.ConsoleForegroundColor.randomColor(175, 255));

		String subject = MyScanner.getScanner().nextLine();

		return subject;
	}
}
