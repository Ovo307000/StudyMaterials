package ShopMangement.Menu;

public class UI
{
	private UI() {}

	public static class Menu
	{
		private Menu() {}

		public static String licenceInformation()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Licence                             ||\n");
			sb.append("===============================================================\n");
			sb.append("|| 1. This program is free software: you can redistribute it  ||\n");
			sb.append("||    and/or modify it under the terms of the GNU General    ||\n");
			sb.append("||    Public License as published by the Free Software       ||\n");
			sb.append("||    Foundation, either version 3 of the License, or        ||\n");
			sb.append("||    (at your option) any later version.                    ||\n");
			sb.append("|| 2. This program is distributed in the hope that it will   ||\n");
			sb.append("||    be useful, but WITHOUT ANY WARRANTY; without even the  ||\n");
			sb.append("||    implied warranty of MERCHANTABILITY or FITNESS FOR A   ||\n");
			sb.append("||    PARTICULAR PURPOSE.  See the GNU General Public        ||\n");
			sb.append("||    License for more details.                              ||\n");
			sb.append("|| 3. You should have received a copy of the GNU General     ||\n");
			sb.append("||    Public License along with this program.  If not, see   ||\n");
			sb.append("||    <http://www.gnu.org/licenses/>.                        ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String GPLV3Logo()
		{
			return "\n" +
			       "                                                                                                                    \n" +
			       "                                                                                                                    \n" +
			       "        GGGGGGGGGGGGGPPPPPPPPPPPPPPPPP   LLLLLLLLLLL                  VVVVVVVV           VVVVVVVV 333333333333333   \n" +
			       "     GGG::::::::::::GP::::::::::::::::P  L:::::::::L                  V::::::V           V::::::V3:::::::::::::::33 \n" +
			       "   GG:::::::::::::::GP::::::PPPPPP:::::P L:::::::::L                  V::::::V           V::::::V3::::::33333::::::3\n" +
			       "  G:::::GGGGGGGG::::GPP:::::P     P:::::PLL:::::::LL                  V::::::V           V::::::V3333333     3:::::3\n" +
			       " G:::::G       GGGGGG  P::::P     P:::::P  L:::::L                     V:::::V           V:::::V             3:::::3\n" +
			       "G:::::G                P::::P     P:::::P  L:::::L                      V:::::V         V:::::V              3:::::3\n" +
			       "G:::::G                P::::PPPPPP:::::P   L:::::L                       V:::::V       V:::::V       33333333:::::3 \n" +
			       "G:::::G    GGGGGGGGGG  P:::::::::::::PP    L:::::L                        V:::::V     V:::::V        3:::::::::::3  \n" +
			       "G:::::G    G::::::::G  P::::PPPPPPPPP      L:::::L                         V:::::V   V:::::V         33333333:::::3 \n" +
			       "G:::::G    GGGGG::::G  P::::P              L:::::L                          V:::::V V:::::V                  3:::::3\n" +
			       "G:::::G        G::::G  P::::P              L:::::L                           V:::::V:::::V                   3:::::3\n" +
			       " G:::::G       G::::G  P::::P              L:::::L         LLLLLL             V:::::::::V                    3:::::3\n" +
			       "  G:::::GGGGGGGG::::GPP::::::PP          LL:::::::LLLLLLLLL:::::L              V:::::::V         3333333     3:::::3\n" +
			       "   GG:::::::::::::::GP::::::::P          L::::::::::::::::::::::L               V:::::V          3::::::33333::::::3\n" +
			       "     GGG::::::GGG:::GP::::::::P          L::::::::::::::::::::::L                V:::V           3:::::::::::::::33 \n" +
			       "        GGGGGG   GGGGPPPPPPPPPP          LLLLLLLLLLLLLLLLLLLLLLLL                 VVV             333333333333333   \n" +
			       "                                                                                                                    \n" +
			       "                                                                                                                    \n" +
			       "                                                                                                                    \n" +
			       "                                                                                                                    \n" +
			       "                                                                                                                    \n" +
			       "                                                                                                                    \n" +
			       "                                                                                                                    \n";
		}

		public static String loginMain()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("+---------------------------LOGIN-----------------------------+\n");
			sb.append("| 1. User login                                               |\n");
			sb.append("| 2. Admin login                                              |\n");
			sb.append("| 3. Exit                                                     |\n");
			sb.append("+-------------------------------------------------------------+\n");

			return sb.toString();
		}

		public static String userLogin()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("+------------------------USER LOGIN---------------------------+\n");
			sb.append("| 1. Login                                                    |\n");
			sb.append("| 2. Register                                                 |\n");
			sb.append("| 3. Back                                                     |\n");
			sb.append("| 4. Exit                                                     |\n");
			sb.append("+-------------------------------------------------------------+\n");

			return sb.toString();
		}

		public static String adminLogin()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("+------------------------ADMIN LOGIN--------------------------+\n");
			sb.append("| 1. Login                                                    |\n");
			sb.append("| 2. Register                                                 |\n");
			sb.append("| 3. Back                                                     |\n");
			sb.append("| 3. Exit                                                     |\n");
			sb.append("+-------------------------------------------------------------+\n");

			return sb.toString();
		}

		public static String adminMenu()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("+---------------------------ADMIN-----------------------------+\n");
			sb.append("| 1. Add commodity                                            |\n");
			sb.append("| 2. Remove commodity                                         |\n");
			sb.append("| 3. Edit commodity                                           |\n");
			sb.append("| 4. Show commodity                                           |\n");
			sb.append("| 5. Show all commodity                                       |\n");
			sb.append("| 6. Show all users                                           |\n");
			sb.append("| 7. Show all admins                                          |\n");
			sb.append("| 8. Edit user                                                |\n");
			sb.append("| 9. Remove user                                              |\n");
			sb.append("|10. Salary increase                                          |\n");
			sb.append("|11. Job change                                               |\n");
			sb.append("|12. Back                                                     |\n");
			sb.append("|13. Exit                                                     |\n");
			sb.append("+-------------------------------------------------------------+\n");

			return sb.toString();
		}

		public static String mainMenu()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("+---------------------------MAIN------------------------------+\n");
			sb.append("| 1. Add commodity                                            |\n");
			sb.append("| 2. Remove commodity                                         |\n");
			sb.append("| 3. Edit commodity                                           |\n");
			sb.append("| 4. Show commodity                                           |\n");
			sb.append("+-------------------------------------------------------------+\n");

			return sb.toString();
		}

	}

	public static class Error
	{
		private Error() {}

		public static String invalidInput()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("!!!!!!!!Invalid input!!!!!!!!\n");

			return sb.toString();
		}

		public static <T> String invalidInput(T t)
		{
			StringBuilder sb = new StringBuilder();

			sb.append(STR."!!!!!!!!Invalid input: \{t}!!!!!!!!\n");

			return sb.toString();
		}

		public static String nonFound()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("!!!!!!!!Non found!!!!!!!!\n");

			return sb.toString();
		}

		public static <T> String nonFound(T t)
		{
			StringBuilder sb = new StringBuilder();

			sb.append(STR."!!!!!!!!Non found: \{t}!!!!!!!!\n");

			return sb.toString();
		}

		public static String nonFoundChoice()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("!!!!!!!!Non found choice!!!!!!!!\n");

			return sb.toString();
		}

		public static String nonFoundChoice(String choice)
		{
			StringBuilder sb = new StringBuilder();

			sb.append(STR."!!!!!!!!Non found choice: \{choice}!!!!!!!!\n");

			return sb.toString();
		}
	}

	public static class Massage
	{

		public static String welcome()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||               Welcome to Shop Management                  ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String exit()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Goodbye!                            ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String loginSuccess()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Login success!                      ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String loginFail()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Login fail!                         ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String registerSuccess()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Register success!                   ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String registerFail()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Register fail!                      ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String addSuccess()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Add success!                        ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String addFail()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Add fail!                           ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String removeSuccess()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Remove success!                     ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String removeFail()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Remove fail!                        ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String editSuccess()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Edit success!                       ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String editFail()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("===============================================================\n");
			sb.append("||                       Edit fail!                          ||\n");
			sb.append("===============================================================\n");

			return sb.toString();
		}

		public static String inputPrompt()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("Please input: ");

			return sb.toString();
		}

		public static String choicePrompt()
		{
			StringBuilder sb = new StringBuilder();

			sb.append("Please input your choice: ");

			return sb.toString();
		}

		public static <T> String confirmPrompt(T t)
		{
			StringBuilder sb = new StringBuilder();

			sb.append(STR."Please confirm \{t} (y/n): ");

			return sb.toString();
		}
	}
}
