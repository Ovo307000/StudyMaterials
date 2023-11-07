package StudentInformationSystem.Person;

import java.util.ArrayList;

public class Student extends Person
{
	private final ArrayList<Student> students = new ArrayList<Student>();
	private       String             level;
	private       String             email;
	private       String             address;
	private       String             phoneNumber;
	private       int                score;


	public Student(String name, int age, String level, String email, String address, String phoneNumber, int score)
	{
		super(name, age);
		this.level       = level;
		this.email       = email;
		this.address     = address;
		this.phoneNumber = phoneNumber;
		this.score       = score;
	}

	public Student() {}

	public String getLevel()
	{
		return level;
	}

	public void setLevel(String level)
	{
		this.level = level;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public String toString()
	{
		return "Student Information:\n" + "Name: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Level: " + level + "\n" + "Email: " + email + "\n" + "Address: " + address + "\n" + "Phone Number: " + phoneNumber + "\n" + "Score: " + score + "\n" + "ID: " + getId() + "\n";
	}
}
