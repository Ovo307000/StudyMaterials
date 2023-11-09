package Chapter06;

import StudentInformationSystem.APIs.ANSI;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreadTest extends Thread
{
	@Override
	public void run()
	{
		PrintSomething.loadingChars();
	}
}
