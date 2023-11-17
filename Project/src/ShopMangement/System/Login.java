package ShopMangement.System;

import ShopMangement.API.ANSI;
import ShopMangement.API.IScanner;
import ShopMangement.Menu.UI;

public class Login
{
	private static String password;

	public static String getUserName()
	{
		boolean invalid = false;
		String  account = null;

		while (! invalid)
		{
			System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
			System.out.println(UI.Massage.Prompt.username());
			System.out.print(ANSI.Reset.RESET);

			account = IScanner.getScanner()
			                  .nextLine();

			if (Check.isEmpty(account))
			{
				System.err.println(UI.Massage.Error.accountEmpty(account));
				break;
			}

			if (Check.isTooLong(account))
			{
				System.err.println(UI.Massage.Error.accountTooLong(account));
				break;
			}

			if (Check.isTooShort(account))
			{
				System.err.println(UI.Massage.Error.accountTooShort(account));
				break;
			}

			if (Check.isAccountInDatabase(account))
			{
				invalid = true;
			}
			else
			{
				System.err.println(UI.Massage.Error.accountNotInDatabase(account));
			}
		}

		return account;
	}

	public static String getPassword()
	{
		boolean invalid = false;

		while (! invalid)
		{
			System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
			System.out.println(UI.Massage.Prompt.password());
			System.out.print(ANSI.Reset.RESET);

			password = IScanner.getScanner()
			                   .nextLine();

			if (Check.isEmpty(password))
			{
				System.err.println(UI.Massage.Error.passwordEmpty(password));
				break;
			}

			if (Check.isTooLong(password))
			{
				System.err.println(UI.Massage.Error.passwordTooLong(password));
				break;
			}

			if (Check.isTooShort(password))
			{
				System.err.println(UI.Massage.Error.passwordTooShort(password));
				break;
			}
		}

		return password;
	}
}
