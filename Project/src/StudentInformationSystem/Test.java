package StudentInformationSystem;

public class Test
{
	public static void main(String[] args)
	{
		Test test = new Test();
		test.run();
	}

	private void run()
	{

			UI.printHeader();
			UI.printMainMenu();
			UI.printInputPrompt();
			MenuChoose.mainMenu();

	}
}
