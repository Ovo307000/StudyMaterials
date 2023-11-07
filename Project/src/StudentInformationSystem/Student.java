package StudentInformationSystem;

import java.util.ArrayList;

public class Student extends Person
{
	private final StudentLevel       level;
	private       String             email;
	private       String             address;
	private       String             phoneNumber;
	private       int                score;
	private       ArrayList<Student> students = new ArrayList<Student>();


	public Student(String name, int age, StudentLevel level)
	{
		super(name, age);
		this.level = level;
	}
}
