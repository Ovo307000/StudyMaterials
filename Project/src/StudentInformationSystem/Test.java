package StudentInformationSystem;

import StudentInformationSystem.ANSI.ANSI;
import StudentInformationSystem.StudentSystem.StudentSystem;
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
		StudentSystem.initialization();
		UI.printWelcomeMassage(200, 255);
		UI.printMainMenu(200, 255);
		UI.printInputPrompt();
		MenuChoose.mainMenu();
	}

	private static void runTest()
	{
		StudentSystem.initialization();

		StudentSystem.removeStudent();
	}
}
