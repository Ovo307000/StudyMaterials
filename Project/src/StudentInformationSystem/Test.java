package StudentInformationSystem;

import StudentInformationSystem.StudentSystem.StudentSystem;
import StudentInformationSystem.TeacherSystem.TeacherSystem;
import StudentInformationSystem.UI.MenuChoose;
import StudentInformationSystem.UI.UI;

public class Test
{
	public static void main(String[] args)
	{
		Test test = new Test();

		test.run();
	}

	private void run()
	{
		StudentSystem.initialization(60);
		TeacherSystem.initialization(60);
		UI.printWelcomeMassage(200, 255);
		UI.printMainMenu(200, 255);
		UI.printInputPrompt();
		MenuChoose.mainMenu();
	}

	private static void runTest()
	{
		StudentSystem.initialization(60);
		TeacherSystem.initialization(60);

		StudentSystem.removeStudent();
	}
}
