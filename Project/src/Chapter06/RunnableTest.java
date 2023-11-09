package Chapter06;

public class RunnableTest
	implements Runnable
{
	@Override
	public void run()
	{
		PrintSomething.loadingChars();
	}
}
