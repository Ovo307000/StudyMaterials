package Chapter06;

import java.util.ArrayList;

public class ThreadBuilder extends Thread
{
	private final int count;

	ThreadBuilder(int count)
	{
		this.count = count;
	}

	@Override
	public void run()
	{

		ArrayList<ThreadTest> threads = new ArrayList<ThreadTest>();

		for (int i = 0; i < this.count; i++)
		{
			threads.add(new ThreadTest());
		}

		for (ThreadTest thread : threads)
		{
			thread.start();
		}
	}
}
