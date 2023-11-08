package StudentInformationSystem.APIs;

import java.security.SecureRandom;
import java.util.Random;

public class MyRandom
{
	private MyRandom() {}

	public static Random secureRandom()
	{
		SecureRandom random = new SecureRandom();
		long         seed   = random.nextLong();
		random.setSeed(seed);

		return random;
	}
}
