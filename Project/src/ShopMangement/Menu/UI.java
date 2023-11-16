package ShopMangement.Menu;

import ShopMangement.API.ISecureRandom;
import ShopMangement.Logo.GPLV3;

public class UI
{
	private UI() {}

	public static class Menu
	{
		private Menu() {}

		public static String licenceInformation()
		{
			return """
			        =================================================================
			        ||                         Licence                             ||
			        =================================================================
			        ||                                                             ||
			        || This program is free software: you can redistribute it      ||
			        || and/or modify it under the terms of the GNU General Public  ||
			        || License as published by the Free Software Foundation,       ||
			        || either version 3 of the License, or (at your option) any    ||
			        || later version.                                              ||
			        ||                                                             ||
			        || This program is distributed in the hope that it will be     ||
			        || useful, but WITHOUT ANY WARRANTY; without even the implied  ||
			        || warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR     ||
			        || PURPOSE.  See the GNU General Public License for more       ||
			        || details.                                                    ||
			        ||                                                             ||
			        || You should have received a copy of the GNU General Public   ||
			        || License along with this program.  If not, see               ||
			        || <https://www.gnu.org/licenses/>.                            ||
			        ||                                                             ||
			        =================================================================
			       """;
		}

		public static String GPLV3Logo()
		{
			return GPLV3.values()[ISecureRandom.secureRandom()
			                                   .nextInt(GPLV3.values().length)].getASCIIArt();
		}

		public static String loginMain()
		{
			return """
			       		+---------------------------MAIN------------------------------+
			       		| 1. User login                                               |
			       		| 2. Admin login                                              |
			       		| 3. Exit                                                     |
			       		+-------------------------------------------------------------+
			       """;
		}

		public static String userLogin()
		{
			return """
			       		+------------------------USER LOGIN---------------------------+
			       		| 1. Login                                                    |
			       		| 2. Register                                                 |
			       		| 3. Back                                                     |
			       		| 4. Exit                                                     |
			       		+-------------------------------------------------------------+
			       """;
		}

		public static String adminLogin()
		{
			return """
			       		+------------------------ADMIN LOGIN--------------------------+
			       		| 1. Login                                                    |
			       		| 2. Register                                                 |
			       		| 3. Back                                                     |
			       		| 4. Exit                                                     |
			       		+-------------------------------------------------------------+
			       """;
		}

		public static String adminMenu()
		{
			return """
			          +---------------------------ADMIN-----------------------------+	
			          | 1. Add commodity                                            |
			          | 2. Remove commodity                                         |
			          | 3. Edit commodity                                           |
			          | 4. Show commodity                                           |
			          | 5. Show all commodity                                       |
			          | 6. Show all users                                           |
			          | 7. Show all admins                                          |
			          | 8. Edit user                                                |
			          | 9. Remove user                                              |
			          |10. Salary increase                                          |
			          |11. Job change                                               |
			          |12. Back                                                     |
			          |13. Exit                                                     |
			          +-------------------------------------------------------------+
			       """;
		}

		public static String mainMenu()
		{
			return """
			          +---------------------------MAIN------------------------------+
			          | 1. User login                                               |
			          | 2. Admin login                                              |
			          | 3. Exit                                                     |
			          +-------------------------------------------------------------+
			       """;
		}

	}

	public static class Massage
	{

		public static String welcome()
		{
			return """
			        ===============================================================
			        ||                          Welcome!                         ||
			        ===============================================================
			       """;
		}

		public static String exit()
		{
			return """
			        ===============================================================
			        ||                          Goodbye!                         ||
			        ===============================================================
			       """;
		}

		public static String loginSuccess()
		{
			return """
			        ===============================================================
			        ||                       Login success!                      ||
			        ===============================================================
			       """;
		}

		public static String loginFail()
		{
			return """
			        ===============================================================
			        ||                       Login fail!                         ||
			        ===============================================================
			       """;
		}


		public static String registerSuccess()
		{
			return """
			       ===============================================================
			       ||                       Register success!                   ||
			       ===============================================================
			       """;
		}

		public static String registerFail()
		{
			return """
			       ===============================================================
			       ||                       Register fail!                      ||
			       ===============================================================
			       """;
		}

		public static String addSuccess()
		{
			return """
			       ===============================================================
			       ||                       Add success!                        ||
			       ===============================================================
			       """;
		}

		public static String addFail()
		{
			return """
			       ===============================================================
			       ||                       Add fail!                           ||
			       ===============================================================
			       """;
		}

		public static String removeSuccess()
		{
			return """
			       ===============================================================
			       ||                       Remove success!                     ||
			       ===============================================================
			       """;
		}

		public static String removeFail()
		{
			return """
			       ===============================================================
			       ||                       Remove fail!                        ||
			       ===============================================================
			       """;
		}

		public static String editSuccess()
		{
			return """
			       ===============================================================
			       ||                       Edit success!                       ||
			       ===============================================================
			       """;
		}

		public static String editFail()
		{
			return """
			       ===============================================================
			       ||                       Edit fail!                          ||
			       ===============================================================
			       """;
		}

		public static String inputPrompt()
		{
			return "Please input: ";
		}

		public static String choicePrompt()
		{
			return "Please input your choice: ";
		}

		public static <T> String confirmPrompt(T t)
		{
			return STR."Please confirm \{t}: ";
		}

		public static class Error
		{
			private Error() {}

			public static String invalidInput()
			{
				return "!!!!!!!!Invalid input!!!!!!!!\n";
			}

			public static <T> String invalidInput(T t)
			{
				return STR."!!!!!!!!Invalid input: \{t}!!!!!!!!\n";
			}

			public static String nonFound()
			{
				return "!!!!!!!!Non found!!!!!!!!\n";
			}

			public static <T> String nonFound(T t)
			{
				return STR."!!!!!!!!Non found: \{t}!!!!!!!!\n";
			}

			public static String nonFoundChoice()
			{
				return "!!!!!!!!Non found choice!!!!!!!!\n";
			}

			public static String nonFoundChoice(String choice)
			{
				return STR."!!!!!!!!Non found choice: \{choice}!!!!!!!!\n";
			}
		}
	}
}
