package StudentInformationSystem;

public class Test
{
	public static void main(String[] args)
	{
		for (int i = 0; i < StudentLevel.values().length; i++)
		{
			System.out.println((i + 1) + ". " + StudentLevel.values()[i].getAbbreviation());
		}
	}

	private void run()
	{

	}
}
