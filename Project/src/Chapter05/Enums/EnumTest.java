package Chapter05.Enums;

enum Size
{
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL");

	private String abbreviation;

	Size(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation()
	{
		return abbreviation;
	}
}

public class EnumTest
{

	public static void main(String[] args)
	{
		Size size = Size.SMALL;
		System.out.println(size);
		System.out.println(size.getAbbreviation());
	}
}
