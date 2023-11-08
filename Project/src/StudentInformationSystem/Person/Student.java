package StudentInformationSystem.Person;

import java.util.ArrayList;

public class Student extends Person
{
	private static int                nextId   = 0;
	private final  ArrayList<Student> students = new ArrayList<Student>();
	private        String             level;
	private        int                score;
	private        int                id;


	public Student(String name, int age, String address, String phoneNumber, String email, String level, int score)
	{
		super(name, age, address, phoneNumber, email);
		this.level = level;
		this.score = score;

		this.id = ++nextId;
	}

	public Student() {}

	public ArrayList<Student> getStudents()
	{
		return students;
	}

	public String getLevel()
	{
		return level;
	}

	public void setLevel(String level)
	{
		this.level = level;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public String getInformation()
	{
		return super.getInformation() + "\nLevel: " + getLevel() + "\nScore: " + getScore() + "\n" + "ID: " + id + "\n";
	}
}
