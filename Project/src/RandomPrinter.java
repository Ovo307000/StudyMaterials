public class RandomPrinter
{
	private int red;
	private int green;
	private int blue;

	RandomPrinter()
	{
		red   = 0;
		green = 0;
		blue  = 0;
	}

	public static void main(String[] args) throws InterruptedException
	{
		new RandomPrinter().printRainbow("This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. This is a test. ");
	}

//	public void print(String string) throws InterruptedException
//	{
//		while (true)
//		{
//			while (red < 255)
//			{
//				red++;
//				System.out.println("\u001B[48;2;" + red + ";" + green + ";" + blue + "m" + string + "\b");
//				Thread.sleep(10);
//				while (green < 255)
//				{
//					green++;
//					System.out.println("\u001B[48;2;" + red + ";" + green + ";" + blue + "m" + string + "\b");
//					while (blue < 255)
//					Thread.sleep(10);
//					{
//						blue++;
//						System.out.println("\u001B[48;2;" + red + ";" + green + ";" + blue + "m" + string + "\b");
//						Thread.sleep(10);
//					}
//				}
//			}
//		}
//
//
//	}
	// 采用sin函数实现颜色渐变
	public void printRainbow(String string)
	{
		int color = 0;
		// 步进速率，此值越高，颜色变化越快
		// 通过调整此值，可以调整颜色变化的速率
		// 原理为传入sin函数的参数影响其曲线的周期
		double stap = 0.024;
		int min = 128;
		int max = 255;

		for (Character c : string.toCharArray())
		{
			double redSin   = Math.sin(stap * color + 0);
			double greenSin = Math.sin(stap * color + 1);
			double blueSin  = Math.sin(stap * color + 2);

			int red   = (int) (min + (max - min) * redSin);
			int green = (int) (min + (max - min) * greenSin);
			int blue  = (int) (min + (max - min) * blueSin);


			if (red < 0 )
			{
				red = 0;
			}

			if (green < 0)
			{
				green = 0;
			}

			if (blue < 0)
			{
				blue = 0;
			}

			System.out.print("\u001B[48;2;" + red + ";" + green + ";" + blue + "m" + c + "\u001B[0m");
//			System.out.println("\t" + "Round " + (color + 1) + " Red: " + red + " Green: " + green + " Blue: " + blue);

			color++;
		}
	}

//	public void printRainbow(String string, int min, int max) throws InterruptedException
//	{
//		int color = 0;
//
//		double
//
//		for (Character c : string.toCharArray())
//		{
//			color++;
//		}
//	}
}
