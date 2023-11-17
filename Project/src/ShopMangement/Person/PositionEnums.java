package ShopMangement.Person;

public enum PositionEnums
{
	ADMIN("管理员", 0),
	USER("员工", 1),
	;

	private String job;
	private int sequence;

	private PositionEnums(String job, int sequence)
	{
		this.job      = job;
		this.sequence = sequence;
	}

	public String getJob()
	{
		return this.job;
	}

	public int getSequence()
	{
		return this.sequence;
	}
}
