package StudentInformationSystem;

public class Student extends Person
{
	private static int          nextId = 0;
	private final  int          id;
	private final  StudentLevel level;
	private        String       email;
	private        String       address;
	private        String       phoneNumber;
	private        int          score;


	public Student(String name, int age, StudentLevel level)
	{
		super(name, age);
		this.level = level;
		this.id    = ++ nextId;
	}
}
