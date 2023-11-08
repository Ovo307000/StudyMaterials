package StudentInformationSystem.Person;

public class Teacher extends Person
{
	private static int    nextId = 0;
	private        int    salary;
	private        String Subject;
	private        int    id;


	public Teacher(String name, int age, String address, String phoneNumber, String email, int salary, String jobTitle)
	{
		super(name, age, address, phoneNumber, email);
		this.salary  = salary;
		this.Subject = jobTitle;

		this.id = ++ nextId;
	}

	public Teacher() {}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String getSubject()
	{
		return Subject;
	}

	public void setSubject(String subject)
	{
		this.Subject = subject;
	}

	public String getInformation()
	{
		return super.getInformation() + "\nSalary: " + getSalary() + "\nJob Title: " + getSubject() + "\n" + "ID: " + id + "\n";
	}
}
