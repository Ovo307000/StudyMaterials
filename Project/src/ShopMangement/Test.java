package ShopMangement;

import ShopMangement.API.ANSI;
import ShopMangement.Menu.UI;

public class Test
{
	public static void main(String[] args) throws InterruptedException
	{
		run();
	}

	public static void run()
	{
		System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
		System.out.println(UI.Massage.welcome());
		System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
		System.out.println(UI.Massage.version());
		System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
		UI.Massage.Print.colorfulString(UI.Massage.Logo.authorLogo());
		System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
		System.out.println(UI.Massage.licenceInformation());
		System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
		UI.Massage.Print.colorfulString(UI.Massage.Logo.GPLV3Logo());
		System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
		System.out.println(UI.Menu.loginMain());
		System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
		System.out.println(UI.Massage.Prompt.choice());

		System.out.print(ANSI.Reset.RESET);
	}
}
