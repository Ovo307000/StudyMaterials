package StudentInformationSystem;

import java.util.Random;

public class ANSI
{
	private ANSI() {}

	// 这是迫不得已加的，与RESET类一样的功能，优点是调用方便，缺点是不够直观，且和其他的调用格式不一样。
	public static String reset()
	{
		return "\u001B[0m";
	}

	public static class Reset
	{
		public static final String RESET = "\u001B[0m";

		private Reset() {}
	}

	public static class ConsoleForegroundColor
	{
		public static final String BLACK  = "\u001B[30m";
		public static final String RED    = "\u001B[31m";
		public static final String GREEN  = "\u001B[32m";
		public static final String YELLOW = "\u001B[33m";
		public static final String BLUE   = "\u001B[34m";
		public static final String PURPLE = "\u001B[35m";
		public static final String CYAN   = "\u001B[36m";
		public static final String WHITE  = "\u001B[37m";

		private ConsoleForegroundColor() {}

		public static String randomColor()
		{
			Random random = new Random();

			int red   = random.nextInt(256);
			int green = random.nextInt(256);
			int blue  = random.nextInt(256);

			return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
		}

		public static String randomColor(int min, int max)
		{
			Random random = new Random();

			int red   = random.nextInt(min, (max + 1));
			int green = random.nextInt(min, (max + 1));
			int blue  = random.nextInt(min, (max + 1));

			return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
		}

		public static String otherColor(int red, int green, int blue)
		{
			return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
		}
	}

	public static class ConsoleBackgroundColor
	{
		private ConsoleBackgroundColor() {}

		public static final String BLACK  = "\u001B[40m";
		public static final String RED    = "\u001B[41m";
		public static final String GREEN  = "\u001B[42m";
		public static final String YELLOW = "\u001B[43m";
		public static final String BLUE   = "\u001B[44m";
		public static final String PURPLE = "\u001B[45m";
		public static final String CYAN   = "\u001B[46m";

		public static final String WHITE  = "\u001B[47m";

		public static String randomColor()
		{
			int red   = new Random().nextInt(256);
			int green = new Random().nextInt(256);
			int blue  = new Random().nextInt(256);

			return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
		}

		public static String randomColor(int min, int max)
		{
			Random randColorValue = new Random();

			int red   = new Random().nextInt(min, (max + 1));
			int green = new Random().nextInt(min, (max + 1));
			int blue  = new Random().nextInt(min, (max + 1));

			return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
		}

		public static String otherColor(int red, int green, int blue)
		{
			return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
		}
	}

	public static class ConsoleFontStyle
	{
		public static final String BOLD          = "\u001B[1m";
		public static final String ITALIC        = "\u001B[3m";
		public static final String UNDERLINE     = "\u001B[4m";
		public static final String STRIKETHROUGH = "\u001B[9m";
		public static final String INVERTED      = "\u001B[7m";
		public static final String HIDDEN        = "\u001B[8m";

		private ConsoleFontStyle() {}
	}
}
