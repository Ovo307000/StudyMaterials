package StudentInformationSystem;

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


	}
}
