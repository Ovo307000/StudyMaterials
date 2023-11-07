package StudentInformationSystem.Enums;

public enum LevelEnums
{
	LEVEL_1("一年级"),
	LEVEL_2("二年级"),
	LEVEL_3("三年级"),
	LEVEL_4("四年级"),
	LEVEL_5("五年级"),
	LEVEL_6("六年级"),
	LEVEL_7("七年级"),
	LEVEL_8("八年级"),
	LEVEL_9("九年级"),
	;

	private final String abbreviation;

	LevelEnums(String abbreviation)
	{
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation()
	{
		return abbreviation;
	}
}
