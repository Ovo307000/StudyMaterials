package Chapter06;

public class ThreadTest extends Thread
{
	@Override
	public void run()
	{
		PrintSomething.loadingChars();
	}
}
