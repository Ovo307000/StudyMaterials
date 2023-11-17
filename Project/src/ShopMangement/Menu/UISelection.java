package ShopMangement.Menu;

import ShopMangement.API.ANSI;
import ShopMangement.API.IScanner;
import ShopMangement.System.LoginMenu;

public class UISelection
{
	private UISelection() {}

	public static void loginMain()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
			System.out.print(UI.Massage.Prompt.choice());
			System.out.print(ANSI.Reset.RESET);


			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 用户登录
				case "1" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.println(UI.Menu.userLogin());
					System.out.print(ANSI.Reset.RESET);
				}

				// 管理员登录
				case "2" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.println(UI.Menu.adminLogin());
					System.out.print(ANSI.Reset.RESET);
				}

				// 退出
				case "3" ->
				{
					invalid = true;
					System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.println(UI.Massage.exit());
					System.out.print(ANSI.Reset.RESET);

					Exit.exit();
				}

				// 无效输入
				default ->
				{
					System.err.print(UI.Massage.Error.invalidInput(choice));
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
			System.out.print(ANSI.Console.FontStyle.BOLD + ANSI.Console.ForegroundColor.randomColor(200, 255));
			System.out.print(UI.Massage.Prompt.choice());
			System.out.print(ANSI.Reset.RESET);

			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 登录
				case "1" ->
				{
					invalid = true;
					LoginMenu.getUserName();
					LoginMenu.getPassword();

				}

				// 注册
				case "2" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 返回
				case "3" ->
				{
					invalid = true;

					loginMain();

				}

				// 退出
				case "4" ->
				{
					invalid = true;

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

	public static void adminLogin()
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

					System.out.println("尚未完工");

				}

				// 返回
				case "2" ->
				{
					invalid = true;

					loginMain();

				}

				// 退出
				case "3" ->
				{
					invalid = true;

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

	public static void userMenu()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 商品信息
				case "1" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 商品编辑
				case "2" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 返回
				case "3" ->
				{
					invalid = true;

					loginMain();

				}

				// 退出
				case "4" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void adminMenu()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 商品信息
				case "1" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 商品编辑
				case "2" ->
				{
					invalid = true;

					System.out.println("商品编辑");

				}

				// 用户信息
				case "3" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 用户编辑
				case "4" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 返回
				case "5" ->
				{
					invalid = true;

					loginMain();

				}

				// 退出
				case "6" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void adminCommodityInformation()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 显示所有信息
				case "1" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 按照ID查询
				case "2" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 返回
				case "3" ->
				{
					invalid = true;

					UI.Menu.adminMenu();

				}

				// 退出
				case "4" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void userCommodityInformation()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 显示所有信息
				case "1" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 按照ID查询
				case "2" ->
				{
					invalid = true;

					System.out.println("尚未完工");

				}

				// 返回
				case "3" ->
				{
					invalid = true;

					UI.Menu.userMenu();

				}

				// 退出
				case "4" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void adminCommodityEdit()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 添加商品
				case "1" ->
				{
					invalid = true;

					System.out.println("添加商品");

				}

				// 下架商品
				case "2" ->
				{
					invalid = true;

					System.out.println("下架商品");

				}

				// 编辑商品价格
				case "3" ->
				{
					invalid = true;

					System.out.println("编辑商品价格");

				}

				// 编辑商品库存
				case "4" ->
				{
					invalid = true;

					System.out.println("编辑商品库存");

				}

				// 编辑商品名称
				case "5" ->
				{
					invalid = true;

					System.out.println("编辑商品名称");

				}

				// 编辑商品状态
				case "6" ->
				{
					invalid = true;

					System.out.println("编辑商品状态");

				}

				// 修改商品描述
				case "7" ->
				{
					invalid = true;

					System.out.println("修改商品描述");

				}

				// 编辑所有
				case "8" ->
				{
					invalid = true;

					System.out.println("编辑所有");

				}

				// 返回
				case "9" ->
				{
					invalid = true;

					UI.Menu.adminMenu();

				}

				// 退出
				case "10" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void userCommodityEdit()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 添加商品
				case "1" ->
				{
					invalid = true;

					System.out.println("添加商品");

				}

				// 下架商品
				case "2" ->
				{
					invalid = true;

					System.out.println("下架商品");

				}

				// 编辑商品价格
				case "3" ->
				{
					invalid = true;

					System.out.println("编辑商品价格");

				}

				// 编辑商品库存
				case "4" ->
				{
					invalid = true;

					System.out.println("编辑商品库存");

				}

				// 编辑商品名称
				case "5" ->
				{
					invalid = true;

					System.out.println("编辑商品名称");

				}

				// 编辑商品状态
				case "6" ->
				{
					invalid = true;

					System.out.println("编辑商品状态");

				}

				// 修改商品描述
				case "7" ->
				{
					invalid = true;

					System.out.println("修改商品描述");

				}

				// 编辑所有
				case "8" ->
				{
					invalid = true;

					System.out.println("编辑所有");

				}

				// 返回
				case "9" ->
				{
					invalid = true;

					UI.Menu.userMenu();

				}

				// 退出
				case "10" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void adminUserInformation()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 显示用户列表
				case "1" ->
				{
					invalid = true;

					System.out.println("显示用户列表");

				}

				// 通过ID查询用户信息
				case "2" ->
				{
					invalid = true;

					System.out.println("通过ID查询用户信息");

				}

				// 通过姓名查询用户信息
				case "3" ->
				{
					invalid = true;

					System.out.println("通过姓名查询用户信息");

				}

				// 显示管理员列表
				case "4" ->
				{
					invalid = true;

					System.out.println("显示管理员列表");

				}

				// 通过ID查询管理员信息
				case "5" ->
				{
					invalid = true;

					System.out.println("通过ID查询管理员信息");

				}

				// 通过姓名查询管理员信息
				case "6" ->
				{
					invalid = true;

					System.out.println("通过姓名查询管理员信息");

				}

				// 显示所有员工列表
				case "7" ->
				{
					invalid = true;

					System.out.println("显示所有员工列表");

				}

				// 通过ID查询员工信息
				case "8" ->
				{
					invalid = true;

					System.out.println("通过ID查询员工信息");

				}

				// 通过姓名查询员工信息
				case "9" ->
				{
					invalid = true;

					System.out.println("通过姓名查询员工信息");

				}

				// 返回
				case "10" ->
				{
					invalid = true;

					UI.Menu.adminMenu();

				}

				// 退出
				case "11" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void adminUserEdit()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 添加用户
				case "1" ->
				{
					invalid = true;

					System.out.println("添加用户");

				}

				// 删除用户
				case "2" ->
				{
					invalid = true;

					System.out.println("删除用户");

				}

				// 编辑用户
				case "3" ->
				{
					invalid = true;

					System.out.println("编辑用户");

				}

				// 修改密码
				case "4" ->
				{
					invalid = true;

					System.out.println("修改密码");

				}

				// 修改职位
				case "5" ->
				{
					invalid = true;

					System.out.println("修改职位");

				}

				// 薪水调整
				case "6" ->
				{
					invalid = true;

					System.out.println("薪水调整");

				}

				// 返回
				case "7" ->
				{
					invalid = true;

					UI.Menu.adminMenu();

				}

				// 退出
				case "8" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}

	public static void userUserEditor()
	{
		boolean invalid = false;
		String  choice  = "";

		while (! invalid)
		{
			choice = IScanner.getScanner()
			                 .nextLine();

			switch (choice)
			{
				// 修改密码
				case "1" ->
				{
					invalid = true;

					System.out.println("修改密码");

				}

				// 返回
				case "2" ->
				{
					invalid = true;

					UI.Menu.userMenu();

				}

				// 退出
				case "3" ->
				{
					invalid = true;

					UI.Massage.exit();
					Exit.exit();
				}
			}
		}
	}
}
