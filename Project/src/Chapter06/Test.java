package Chapter06;

public class Test
{
	public static void main(String[] args)
	{
		ThreadBuilder threadBuilder = new ThreadBuilder(512);

		threadBuilder.start();
	}
}
