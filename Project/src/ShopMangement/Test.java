package ShopMangement;

import ShopMangement.API.ANSI;
import ShopMangement.Logo.Author;
import ShopMangement.Logo.GPLV3;

import java.util.ArrayList;
import java.util.Arrays;

public class Test
{
	public static void main(String[] args)
	{
		GPLV3[]           gplV3s = GPLV3.values();
		Author[]          athors = Author.values();
		ArrayList<String> logos  = new ArrayList<String>();

		for (GPLV3 gpl : gplV3s)
		{
			logos.add(gpl.getASCIIArt());
		}

		for (Author athor : athors)
		{
			logos.add(athor.getASCIIArt());
		}


		for (String logo : logos)
		{
			for (char i : logo.toCharArray())
			{
				System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
				System.out.print(i);
			}

			System.out.println("\n\n");
		}

		System.out.print(ANSI.Reset.RESET);

	}
}
