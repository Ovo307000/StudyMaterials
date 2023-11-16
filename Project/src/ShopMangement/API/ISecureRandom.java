package ShopMangement.API;

import java.security.SecureRandom;
import java.util.Random;

public class ISecureRandom
{
	private ISecureRandom() {}

	public static Random secureRandom()
	{
		return new SecureRandom();
	}
}
