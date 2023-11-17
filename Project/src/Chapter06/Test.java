package Chapter06;

public class Test
		implements java.lang.Comparable<Test>
{
	public static void main(String[] args)
	{
		ThreadBuilder threadBuilder = new ThreadBuilder(512);

		threadBuilder.start();
	}

	@Override
	public int compareTo(Test o)
	{
		return this.compareTo(o);
	}

	@Override
	public String toString()
	{
		return this.equals(obj);
	}
}
