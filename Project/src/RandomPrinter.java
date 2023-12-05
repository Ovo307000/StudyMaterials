public class RandomPrinter
{
	private final int red;
	private final int green;
	private final int blue;

	RandomPrinter()
	{
		red   = 0;
		green = 0;
		blue  = 0;
	}

	public static void main(String[] args) throws InterruptedException
	{
		String authorLogo = """
		                         OOOOOOOOO                                           333333333333333       000000000    77777777777777777777    000000000         000000000         000000000    
		                       OO:::::::::OO                                        3:::::::::::::::33   00:::::::::00  7::::::::::::::::::7  00:::::::::00     00:::::::::00     00:::::::::00  
		                     OO:::::::::::::OO                                      3::::::33333::::::300:::::::::::::007::::::::::::::::::700:::::::::::::00 00:::::::::::::00 00:::::::::::::00
		                    O:::::::OOO:::::::O                                     3333333     3:::::0:::::::000:::::::777777777777:::::::0:::::::000:::::::0:::::::000:::::::0:::::::000:::::::0
		                    O::::::O   O::::::vvvvvvv           vvvvvvvooooooooooo              3:::::0::::::0   0::::::0          7::::::70::::::0   0::::::0::::::0   0::::::0::::::0   0::::::0
		                    O:::::O     O:::::Ov:::::v         v:::::oo:::::::::::oo            3:::::0:::::0     0:::::0         7::::::7 0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
		                    O:::::O     O:::::O v:::::v       v:::::o:::::::::::::::o   33333333:::::30:::::0     0:::::0        7::::::7  0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
		                    O:::::O     O:::::O  v:::::v     v:::::vo:::::ooooo:::::o   3:::::::::::3 0:::::0 000 0:::::0       7::::::7   0:::::0 000 0:::::0:::::0 000 0:::::0:::::0 000 0:::::0
		                    O:::::O     O:::::O   v:::::v   v:::::v o::::o     o::::o   33333333:::::30:::::0 000 0:::::0      7::::::7    0:::::0 000 0:::::0:::::0 000 0:::::0:::::0 000 0:::::0
		                    O:::::O     O:::::O    v:::::v v:::::v  o::::o     o::::o           3:::::0:::::0     0:::::0     7::::::7     0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
		                    O:::::O     O:::::O     v:::::v:::::v   o::::o     o::::o           3:::::0:::::0     0:::::0    7::::::7      0:::::0     0:::::0:::::0     0:::::0:::::0     0:::::0
		                    O::::::O   O::::::O      v:::::::::v    o::::o     o::::o           3:::::0::::::0   0::::::0   7::::::7       0::::::0   0::::::0::::::0   0::::::0::::::0   0::::::0
		                    O:::::::OOO:::::::O       v:::::::v     o:::::ooooo:::::3333333     3:::::0:::::::000:::::::0  7::::::7        0:::::::000:::::::0:::::::000:::::::0:::::::000:::::::0
		                     OO:::::::::::::OO         v:::::v      o:::::::::::::::3::::::33333::::::300:::::::::::::00  7::::::7          00:::::::::::::00 00:::::::::::::00 00:::::::::::::00
		                       OO:::::::::OO            v:::v        oo:::::::::::oo3:::::::::::::::33   00:::::::::00   7::::::7             00:::::::::00     00:::::::::00     00:::::::::00  
		                         OOOOOOOOO               vvv           ooooooooooo   333333333333333       000000000    77777777                000000000         000000000         000000000        					
		                               """;


//		new RandomPrinter().printRainbow(authorLogo, 0.05, 64, 255);

		new RandomPrinter().printRainbow(
				"TestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTest");
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
	public void printRainbow(String string, double stepRate, int min, int max)
	{
		int color = 0;

		for (Character c : string.toCharArray())
		{
			// 设置颜色，stepRate为步长，min为最小值，max为最大值
			// 之所以使用stepRate * 迭代值，是为了让颜色渐变的更加平滑，否则颜色会跳跃，因为直接传入color的值过于大
			// 当然也可以写成 color / 步长，取决于你的需求
			// 最后乘上最大和最小值的区间，将值映射到最大和最小值之间后，再加上最小值，就可以得到最终的颜色值
			// 再将颜色值转换为int类型，因为Math.sin()返回的是double类型
			int red   = (int) (Math.sin(stepRate * color + 0) * (max - min) + min);
			int green = (int) (Math.sin(stepRate * color + 1) * (max - min) + min);
			int blue  = (int) (Math.sin(stepRate * color + 2) * (max - min) + min);

			red   = red < 0 ? 0 : red;
			green = green < 0 ? 0 : green;
			blue  = Math.max(blue, min);

			color++;

			System.out.print("\u001B[48;2;" + red + ";" + green + ";" + blue + "m" + c);

			System.out.println("Red: " + red + " Green: " + green + " Blue: " + blue);
			System.out.println("Red sin: " + Math.sin(stepRate * color + 0) * (max - min) + min);
			System.out.println("Green sin: " + Math.sin(stepRate * color + 1 * (max - min) + min));
			System.out.println("Blue sin: " + Math.sin(stepRate * color + 2 * (max - min) + min));
			System.out.println("Color: " + color);
		}
	}

	public void printRainbow(String string)
	{
		int color = 0;
		int max   = 255;
		int min   = 0;

		double stepRate = 0.5;

		for (Character c : string.toCharArray())
		{
			int red   = (int) ((Math.sin(stepRate * color + 0) * (max - min)) + min);
			int green = (int) ((Math.sin(stepRate * color + 1) * (max - min)) + min);
			int blue  = (int) ((Math.sin(stepRate * color + 2) * (max - min)) + min);

			red   = Math.max(red, min);
			green = Math.max(green, min);
			blue  = Math.max(blue, min);

			System.out.println("\u001b[48;2;" + red + ";" + green + ";" + blue + "m" + c + "\u001b[0m");
//			System.out.println(STR."Red: \{red}\tBlue: \{blue}\tGreen: \{green}");

			color++;
		}

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

