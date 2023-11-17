package ShopMangement.Menu;

import ShopMangement.API.ANSI;
import ShopMangement.API.ISecureRandom;
import ShopMangement.Logo.Author;
import ShopMangement.Logo.GPLV3;

public class UI
{
	private UI() {}

	public static class Menu
	{
		private Menu() {}

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
			          | 1. Commodity Information                                    |
			          | 2. Commodity Editor                                         |
			          | 3. User Information                                         |
			          | 4. User Editor                                              |
			          | 5. Back                                                     |
			          | 6. Exit                                                     |
			          +-------------------------------------------------------------+
			       """;
		}

		public static String userMenu()
		{
			return """
			          +---------------------------USER------------------------------+
			          | 1. Commodity Information                                    |
			          | 2. Commodity Editor                                         |
			          | 3. Back                                                     |
			          | 4. Exit                                                     |
			          +-------------------------------------------------------------+
			       """;
		}

		public static String commodityInformation()
		{
			return """
			          +------------------------COMMODITY INFORMATION----------------+
			          | 1. Show all                                                 |
			          | 2. Show by id											    |
			          | 3. Back                                                     |
			          | 4. Exit                                                     |
			          +-------------------------------------------------------------+
			       """;
		}

		public static String commodityEditor()
		{
			return """
			          +------------------------COMMODITY EDITOR---------------------+
			          | 1. Add                                                      |
			          | 2. Remove                                                   |
			          | 3. Edit price											    |
			          | 4. Edit quantity										    |
			          | 5. Edit name											    |
			          | 6. Edit status											    |
			          | 7. Edit description										    |
			          | 8. Edit all												    |
			          | 9. Back                                                     |
			          |10. Exit                                                     |
			          +-------------------------------------------------------------+
			       """;
		}

		public static String userInformation()
		{
			return """
			          +------------------------USER INFORMATION---------------------+
			          | 1. Show userList											|
			          | 2. Search user by id										|
			          | 3. Search user by name										|
			          | 4. Show adminList											|
			          | 5. Search admin by id										|
			          | 6. Search admin by name										|
			          | 7. Show all employeeList		    						|
			          | 8. Search employee by id									|
			          | 9. Search employee by name									|
			          |10. Back                                                     |
			          |11. Exit                                                     |
			          +-------------------------------------------------------------+
			       """;
		}

		public static String adminUserEditor()
		{
			return """
			          +-----------------ADMIN USER EDITOR--------------------------+
			          | 1. Add                                                     |
			          | 2. Remove                                                  |
			          | 3. Edit                 							       |
			          | 4. Change password										   |
			          | 5. Change position										   |
			          | 6. Salary increase										   |
			          | 7. Back                                                    |
			          | 8. Exit                                                    |
			          +------------------------------------------------------------+
			       """;
		}

		public static String userUserEditor()
		{
			return """
			          +------------------------USER EDITOR--------------------------+
			          | 1. Change password										   |
			          | 2. Back                                                    |
			          | 3. Exit                                                    |
			          +------------------------------------------------------------+
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

		public static String version()
		{
			return """
			       ===============================================================
			       ||                       Version: 1.0.0                      ||
			       ===============================================================
			       """;
		}

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

		public static class Prompt
		{

			public static String input()
			{
				return "Please input: ";
			}

			public static String choice()
			{
				return "Please input your choice: ";
			}

			public static <T> String confirm(T t)
			{
				return STR."Please confirm \{t}: ";
			}

			public static String username()
			{
				return "Please input your username: ";
			}

			public static String password()
			{
				return "Please input your password: ";
			}

			public static String passwordConfirm()
			{
				return "Please confirm your password: ";
			}
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

			public static String nonFoundUser()
			{
				return "!!!!!!!!Non found user!!!!!!!!\n";
			}

			public static <T> String nonFoundUser(T user)
			{
				return STR."!!!!!!!!Non found user: \{user}!!!!!!!!\n";
			}

			public static <T> String accountTooLong(T t)
			{
				return STR."!!!!!!!!Account too long: \{t}!!!!!!!!\n";
			}

			public static <T> String accountTooShort(T t)
			{
				return STR."!!!!!!!!Accont too short: \{t}!!!!!!!!\n";
			}

			public static <T> String accountNotExist(T account)
			{
				return STR."!!!!!!!!Account \{account} not exist!!!!!!!!\n";
			}

			public static <T> String accountEmpty(T account)
			{
				return STR."!!!!!!!!Account \{account} is empty!!!!!!!!\n";
			}

			public static <T> String passwordTooLong(T t)
			{
				return STR."!!!!!!!!Password too long: \{t}!!!!!!!!\n";
			}

			public static <T> String passwordTooShort(T t)
			{
				return STR."!!!!!!!!Password too short: \{t}!!!!!!!!\n";
			}

			public static String passwordNotMatch()
			{
				return "!!!!!!!!Password not match!!!!!!!!\n";
			}

			public static <T> String passwordEmpty(T password)
			{
				return STR."!!!!!!!!Password \{password} is empty!!!!!!!!\n";
			}

			public static String accountNotInDatabase(String account)
			{
				return STR."!!!!!!!!Account \{account} not in database!!!!!!!!\n";
			}
		}

		public static class Logo
		{
			private Logo() {}


			public static String authorLogo()
			{

				return Author.values()[ISecureRandom.secureRandom()
				                                    .nextInt(Author.values().length)].getASCIIArt();
			}

			public static String GPLV3Logo()
			{
				return GPLV3.values()[ISecureRandom.secureRandom()
				                                   .nextInt(GPLV3.values().length)].getASCIIArt();
			}
		}

		public static class Print
		{
			public static void colorfulString(String massage)
			{
				for (char i : massage.toCharArray())
				{
					System.out.print(ANSI.Console.ForegroundColor.randomColor(200, 255));
					System.out.print(i);
				}
				System.out.print(ANSI.Reset.RESET);
			}

			public static void colorfulString(String massage, int min, int max)
			{
				for (char i : massage.toCharArray())
				{
					System.out.print(ANSI.Console.ForegroundColor.randomColor(min, max));
					System.out.print(i);
				}
				System.out.print(ANSI.Reset.RESET);
			}
		}
	}
}
