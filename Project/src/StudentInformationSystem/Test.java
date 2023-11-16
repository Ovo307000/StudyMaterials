package StudentInformationSystem;

import StudentInformationSystem.StudentSystem.StudentSystem;
import StudentInformationSystem.TeacherSystem.TeacherSystem;
import StudentInformationSystem.UI.MenuChoose;
import StudentInformationSystem.UI.UI;


public class Test
{
	public static void main(String[] args)
	{
		new Test().run();
	}

	private static void runTest()
	{
		StudentSystem.initialization(300);
		TeacherSystem.initialization(300);

		StudentSystem.removeStudent();
	}

	private void run()
	{
		StudentSystem.initialization(60);
		TeacherSystem.initialization(60);
		UI.printWelcomeMassage(200, 255);
		UI.printMainMenu(200, 255);
		MenuChoose.mainMenu();
	}
}
