package StudentInformationSystem.StudentSystem;

import StudentInformationSystem.APIs.MyRandom;
import StudentInformationSystem.Enums.LevelEnums;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomInformation
{
	private RandomInformation() {}

	public static String getRandomLevel()
	{
		ArrayList<LevelEnums> levels = new ArrayList<LevelEnums>(Arrays.asList(LevelEnums.values()));

		return levels.get(MyRandom.secureRandom()
		                          .nextInt(levels.size()))
		             .getAbbreviation();
	}

	public static int getRandomScore()
	{
		return MyRandom.secureRandom()
		               .nextInt(100);
	}
}
