package Chapter06;

import StudentInformationSystem.APIs.ANSI;

public class PrintSomething
{
	public static void loadingChars()
	{
		char[] chars = new char[]{'-', '\\', '|', '/', '-', '\\', '|', '/'};

		while (true)
		{
			for (char character : chars)
			{
				System.out.print(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor());
				System.out.print(Thread.currentThread()
				                       .getName() + ": " + character + "\t");

				try
				{
					Thread.sleep(10);
				}
				catch (InterruptedException e)
				{
					throw new RuntimeException(e);
				}
			}
			System.out.print(ANSI.Reset.RESET);
		}
	}
}
