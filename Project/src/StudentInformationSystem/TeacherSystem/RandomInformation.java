package StudentInformationSystem.TeacherSystem;

import StudentInformationSystem.APIs.MyRandom;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomInformation
{
	private RandomInformation() {}

	public static int getRandomSalary()
	{
		return MyRandom.secureRandom()
		               .nextInt(30000);
	}

	public static String getRandomSubject()
	{
		ArrayList<String> subjects = new ArrayList<String>(
				Arrays.asList("Math", "English", "Chinese", "Physics", "Chemistry", "Biology", "History", "Geography",
				              "Politics", "Music", "Art"));

		return subjects.get(MyRandom.secureRandom()
		                            .nextInt(subjects.size()));
	}
}
