package ShopMangement.Logo;

public enum Author
{
	Doh("""	    				                                                                                                                                                                                                                                                                                                                                                             
	               OOOOOOOOO                                           333333333333333       000000000    77777777777777777777    000000000         000000000         000000000    
	             OO:::::::::OO                                        3:::::::::::::::33   00:::::::::00  7::::::::::::::::::7  00:::::::::00     00:::::::::00     00:::::::::00  
	           OO:::::::::::::OO                                      3::::::33333::::::300:::::::::::::007::::::::::::::::::700:::::::::::::00 00:::::::::::::00 00:::::::::::::00
	          O:::::::OOO:::::::O                                     3333333     3:::::0:::::::000:::::::777777777777:::::::0:::::::000:::::::0:::::::000:::::::0:::::::000:::::::0
	          O::::::O   O::::::vvvvvvv           vvvvvvvooooooooooo              3:::::0::::::0   0::::::0          7::::::70::::::0   0::::::0::::::0   0::::::0::::::0   0::::::0
	          O:::::O     O:::::Ov:::::v         v:::::oo:::::::::::oo            3:::::0:::::0     0:::::0         7::::::7 0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
	          O:::::O     O:::::O v:::::v       v:::::o:::::::::::::::o   33333333:::::30:::::0     0:::::0        7::::::7  0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
	          O:::::O     O:::::O  v:::::v     v:::::vo:::::ooooo:::::o   3:::::::::::3 0:::::0 000 0:::::0       7::::::7   0:::::0 000 0:::::0:::::0 000 0:::::0:::::0 000 0:::::0
	          O:::::O     O:::::O   v:::::v   v:::::v o::::o     o::::o   33333333:::::30:::::0 000 0:::::0      7::::::7    0:::::0 000 0:::::0:::::0 000 0:::::0:::::0 000 0:::::0
	          O:::::O     O:::::O    v:::::v v:::::v  o::::o     o::::o           3:::::0:::::0     0:::::0     7::::::7     0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
	          O:::::O     O:::::O     v:::::v:::::v   o::::o     o::::o           3:::::0:::::0     0:::::0    7::::::7      0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
	          O::::::O   O::::::O      v:::::::::v    o::::o     o::::o           3:::::0::::::0   0::::::0   7::::::7       0::::::0   0::::::0::::::0   0::::::0::::::0   0::::::0
	          O:::::::OOO:::::::O       v:::::::v     o:::::ooooo:::::3333333     3:::::0:::::::000:::::::0  7::::::7        0:::::::000:::::::0:::::::000:::::::0:::::::000:::::::0
	           OO:::::::::::::OO         v:::::v      o:::::::::::::::3::::::33333::::::300:::::::::::::00  7::::::7          00:::::::::::::00 00:::::::::::::00 00:::::::::::::00
	             OO:::::::::OO            v:::v        oo:::::::::::oo3:::::::::::::::33   00:::::::::00   7::::::7             00:::::::::00     00:::::::::00     00:::::::::00  
	               OOOOOOOOO               vvv           ooooooooooo   333333333333333       000000000    77777777                000000000         000000000         000000000        					
	    """
			, "Doh"),

	;

	private final String ASCIIArt;
	private final String name;

	Author(String ASCIIArt, String name)
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
