package ShopMangement.Menu;

import ShopMangement.API.ANSI;
import ShopMangement.API.IScanner;

public class UISelection
{
	private UISelection() {}

	public static void menu()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 用户登录
				case "1" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.println("尚未完工");
					System.out.print(ANSI.Reset.RESET);
				}

				// 管理员登录
				case "2" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.println("尚未完工");
					System.out.print(ANSI.Reset.RESET);
				}

				// 退出
				case "3" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					UI.Massage.exit();
					Exit.exit();
				}

				// 无效输入
				default ->
				{
					System.err.println(UI.Massage.Error.invalidInput(choice));
				}
			}
		}
	}

	public static void userLogin()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{


			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 登录
				case "1" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.println("尚未完工");
					System.out.print(ANSI.Reset.RESET);
				}

				// 注册
				case "2" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.println("尚未完工");
					System.out.print(ANSI.Reset.RESET);
				}

				// 返回
				case "3" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					menu();
					System.out.print(ANSI.Reset.RESET);
				}

				// 退出
				case "4" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					UI.Massage.exit();
					Exit.exit();
				}

				// 无效输入
				default ->
				{
					System.err.println(UI.Error.invalidInput(choice));
				}

			}
		}
	}


}
