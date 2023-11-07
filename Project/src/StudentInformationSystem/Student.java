package StudentInformationSystem;

import java.util.ArrayList;

public class Student extends Person
{
	private StudentLevel       level;
	private String             email;
	private String             address;
	private String             phoneNumber;
	private       int                score;
	private final ArrayList<Student> students = new ArrayList<Student>();


	public Student(String name, int age, StudentLevel level, String email, String address, String phoneNumber,
	               int score)
	{
		super(name, age);
		this.level       = level;
		this.email       = email;
		this.address     = address;
		this.phoneNumber = phoneNumber;
		this.score       = score;
	}

	public Student() {}

}
