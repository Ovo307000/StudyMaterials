package ShopMangement.API;

import java.util.Scanner;

public class IScanner
{
	private IScanner() {}

	public static Scanner getScanner()
	{
		return new Scanner(System.in);
	}
}
