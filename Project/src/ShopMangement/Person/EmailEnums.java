package ShopMangement.Person;

public enum EmailEnums
{
	HOTMAIL("@hotmail.com", 0),
	GMAIL("@gmail.com", 1),
	NetEase163("@163.com", 2),
	NetEase126("@126.com", 3),
	SINA("@sina.com", 4),
	QQ("@qq.com", 5),
	OUTLOOK("@outlook.com", 6),
	WHATSAPP("@whatsapp.com", 7),
	YAHOO("@yahoo.com", 8),
	FACEBOOK("@facebook.com", 9),
	TWITTER("@twitter.com", 10),
	WEIBO("@weibo.com", 11),
	;


	private final String suffix;
	private final int    sequence;

	EmailEnums(String suffix, int sequence)
	{
		this.suffix   = suffix;
		this.sequence = sequence;
	}

	public String getSuffix()
	{
		return this.suffix;
	}

	public int getSequence()
	{
		return this.sequence;
	}
}
