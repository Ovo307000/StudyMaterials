package StudentInformationSystem;

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
		private Reset () {}

		public static final String RESET = "\u001B[0m";
	}

	public static class ConsoleForegroundColor
	{
		private ConsoleForegroundColor() {}

		public static final String BLACK = "\u001B[30m";
		public static final String RED = "\u001B[31m";
		public static final String GREEN = "\u001B[32m";
		public static final String YELLOW = "\u001B[33m";
		public static final String BLUE = "\u001B[34m";
		public static final String PURPLE = "\u001B[35m";
		public static final String CYAN = "\u001B[36m";
		public static final String WHITE = "\u001B[37m";

		public static String randomColor()
		{
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);

			return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
		}

		public static String randomColor(int min, int max)
		{
			int red = (int)(Math.random() * (max - min) + min);
			int green = (int)(Math.random() * (max - min) + min);
			int blue = (int)(Math.random() * (max - min) + min);

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

		public static final String BLACK = "\u001B[40m";
		public static final String RED = "\u001B[41m";
		public static final String GREEN = "\u001B[42m";
		public static final String YELLOW = "\u001B[43m";
		public static final String BLUE = "\u001B[44m";
		public static final String PURPLE = "\u001B[45m";
		public static final String CYAN = "\u001B[46m";
		public static final String WHITE = "\u001B[47m";

		public static String randomColor()
		{
			int red = (int)(Math.random() * 255);
			int green = (int)(Math.random() * 255);
			int blue = (int)(Math.random() * 255);

			return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
		}

		public static String randomColor(int min, int max)
		{
			int red = (int)(Math.random() * (max - min) + min);
			int green = (int)(Math.random() * (max - min) + min);
			int blue = (int)(Math.random() * (max - min) + min);

			return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
		}

		public static String otherColor(int red, int green, int blue)
		{
			return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
		}
	}

	public static class ConsoleFontStyle
	{
		private ConsoleFontStyle() {}

		public static final String BOLD = "\u001B[1m";
		public static final String ITALIC = "\u001B[3m";
		public static final String UNDERLINE = "\u001B[4m";
		public static final String STRIKETHROUGH = "\u001B[9m";
		public static final String INVERTED = "\u001B[7m";
		public static final String HIDDEN = "\u001B[8m";
	}
}
