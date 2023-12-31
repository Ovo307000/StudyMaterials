package ShopMangement.API;

public class ANSI
{
	private ANSI() {}

	// 这是迫不得已加的，与RESET类一样的功能，优点是调用方便，缺点是不够直观，且和其他的调用格式不一样。
	public static String reset()
	{
		return "\u001B[0m";
	}

	// 颜色深度检查
	private static void valuecheck(int... value)
	{
		for (int i : value)
		{
			if (i < 0 || i > 255)
			{
				throw new IllegalArgumentException("The value must be between 0 and 255.");
			}
		}
	}

	public static class Reset
	{
		public static final String RESET = "\u001B[0m";

		private Reset() {}
	}

	public static class Console
	{
		// 清屏
		public static final String CLEAR_SCREEN = "\u001B[2J";
		// 光标复位
		public static final String RESET_CURSOR = "\u001B[H";

		private Console() {}

		public static class FontStyle
		{
			// 粗体
			public static final String BOLD          = "\u001B[1m";
			// 斜体
			public static final String ITALIC        = "\u001B[3m";
			// 下划线
			public static final String UNDERLINE     = "\u001B[4m";
			// 闪烁
			public static final String BLINK         = "\u001B[5m";
			// 快速闪烁
			public static final String FAST_BLINK    = "\u001B[6m";
			// 反显
			public static final String REVERSE_VIDEO = "\u001B[7m";
			// 隐藏
			public static final String HIDE          = "\u001B[8m";
			// 删除线
			public static final String STRIKETHROUGH = "\u001B[9m";

			private FontStyle() {}
		}

		public static class BackgroundColor
		{
			public static final String BLACK  = "\u001B[40m";
			public static final String RED    = "\u001B[41m";
			public static final String GREEN  = "\u001B[42m";
			public static final String YELLOW = "\u001B[43m";
			public static final String BLUE   = "\u001B[44m";
			public static final String PURPLE = "\u001B[45m";
			public static final String CYAN   = "\u001B[46m";
			public static final String WHITE  = "\u001B[47m";

			private BackgroundColor() {}

			public static String randomColor()
			{
				int red = ISecureRandom.secureRandom()
				                       .nextInt(256);
				int blue = ISecureRandom.secureRandom()
				                        .nextInt(256);
				int green = ISecureRandom.secureRandom()
				                         .nextInt(256);

				return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
			}

			public static String randomColor(int min, int max)
			{
				valuecheck(min, max);

				int red = ISecureRandom.secureRandom()
				                       .nextInt(min, (max + 1));
				int blue = ISecureRandom.secureRandom()
				                        .nextInt(min, (max + 1));
				int green = ISecureRandom.secureRandom()
				                         .nextInt(min, (max + 1));

				return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
			}

			public static String otherColor(int red, int green, int blue)
			{
				valuecheck(red, green, blue);

				return "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
			}
		}

		public static class ForegroundColor
		{
			public static final String BLACK  = "\u001B[30m";
			public static final String RED    = "\u001B[31m";
			public static final String GREEN  = "\u001B[32m";
			public static final String YELLOW = "\u001B[33m";
			public static final String BLUE   = "\u001B[34m";
			public static final String PURPLE = "\u001B[35m";
			public static final String CYAN   = "\u001B[36m";
			public static final String WHITE  = "\u001B[37m";

			private ForegroundColor() {}

			public static String randomColor()
			{
				int red = ISecureRandom.secureRandom()
				                       .nextInt(256);
				int green = ISecureRandom.secureRandom()
				                         .nextInt(256);
				int blue = ISecureRandom.secureRandom()
				                        .nextInt(256);

				return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
			}

			public static String randomColor(int min, int max)
			{
				valuecheck(min);
				valuecheck(max);

				int red = ISecureRandom.secureRandom()
				                       .nextInt(min, (max + 1));
				int blue = ISecureRandom.secureRandom()
				                        .nextInt(min, (max + 1));
				int green = ISecureRandom.secureRandom()
				                         .nextInt(min, (max + 1));

				return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
			}

			public static String otherColor(int red, int green, int blue)
			{
				valuecheck(red, green, blue);

				return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
			}
		}
	}
}
