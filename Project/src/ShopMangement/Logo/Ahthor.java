package ShopMangement.Logo;

public enum Ahthor
{
	Bulbhead
			(
					"\n" +
					"//   _____ _  _ _____ ___  ___ ___ ___   ___   ___  \n" +
					"//  (  _  ( \\/ (  _  (__ )/ _ (__ / _ \\ / _ \\ / _ \\ \n" +
					"//   )(_)( \\  / )(_)( (_ ( (_) / ( (_) ( (_) ( (_) )\n" +
					"//  (_____) \\/ (_____(___/\\___(_/ \\___/ \\___/ \\___/ \n"
			, "Bulbhead"),

	;

	private String ASCIIArt;
	private String name;

	private Ahthor(String ASCIIArt, String name)
	{
		this.ASCIIArt = ASCIIArt;
		this.name     = name;
	}

	public String getASCIIArt()
	{
		return this.ASCIIArt;
	}

	public String getName()
	{
		return this.name;
	}
}
