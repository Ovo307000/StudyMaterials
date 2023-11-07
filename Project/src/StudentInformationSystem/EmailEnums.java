package StudentInformationSystem;

public enum EmailEnums
{
	GOOGLE("gmail.com"),
	OUTLOOK("outlook.com"),
	YAHOO("yahoo.com"),
	QQ("qq.com"),
	NETEASE_163("163.com"),
	NETEASE_126("126.com"),
	HOTMAIL("hotmail.com"),
	ICLOUD("icloud.com"),
	YANDEX("yandex.com"),
	AOL("aol.com"),
	ZOHO("zoho.com"),
	PROTONMAIL("protonmail.com"),
	;

	private final String domain;

	EmailEnums(String domain)
	{
		this.domain = domain;
	}

	public String getDomain()
	{
		return domain;
	}

	public String getEmailAddress(String head)
	{
		return head + "@" + domain;
	}
}
