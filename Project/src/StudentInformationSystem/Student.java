package StudentInformationSystem;

import java.util.ArrayList;

public class Student extends Person
{
	private final ArrayList<Student> students = new ArrayList<Student>();
	private       String             level;
	private       String             email;
	private       String             address;
	private       String             phoneNumber;
	private       int                score;


	public Student(String name, int age, String level, String email, String address, String phoneNumber,
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


	public String toString()
	{
		return "Student Information:\n" + "Name: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Level: " + level + "\n" + "Email: " + email + "\n" + "Address: " + address + "\n" + "Phone Number: " + phoneNumber + "\n" + "Score: " + score;
	}
}
