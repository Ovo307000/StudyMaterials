package ShopMangement;

import java.security.SecureRandom;
import java.util.Random;

public class ISecureRandom
{
	// 设置随机数种子
	private static long seed;
	// 设置自定义随机数种子
	private static long customSeed;

	// 设置随机数对象
	private static SecureRandom secureRandom = new SecureRandom();
	private ISecureRandom() {}

	// 获取安全随机数对象
	public static Random secureRandom()
	{
		long         seed   = secureRandom.nextLong();

		secureRandom.setSeed(seed);

		return secureRandom;
	}

	// 获取自定义随机数对象
	public static Random secureRandom(long customSeed)
	{
		secureRandom.setSeed(customSeed);

		return secureRandom;
	}

	public static long getSeed()
	{
		return seed;
	}

	public static long getCustomSeed()
	{
		return customSeed;
	}

}
