package StudentInformationSystem;

public class Student extends Person
{
	private final  int          id;
	private static int          nextId = 0;
	private final  StudentLevel level;
	private        int          score;

	public Student(String name, int age, StudentLevel level)
	{
		super(name, age);
		this.level = level;
		this.id    = ++ nextId;
	}
}
