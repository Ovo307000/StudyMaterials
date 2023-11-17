package ShopMangement.Person;

public class Employee
{
	private static int           nextId = 0;
	protected      int           id;
	private        String        name;
	private        int           age;
	private        String        address;
	private        String        phone;
	private        String        email;
	private        String        password;
	private        String        salary;
	private        String        dateOfJoining;
	private        String        dateOfBirth;
	private        PositionEnums position;
	private        String        account;

	public Employee(String name, int age, String address, String phone, String email, String password,
	                String salary, String dateOfJoining, String dateOfBirth, PositionEnums position, String account)
	{
		this.id            = ++ nextId;
		this.name          = name;
		this.age           = age;
		this.address       = address;
		this.phone         = phone;
		this.email         = email;
		this.password      = password;
		this.salary        = salary;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth   = dateOfBirth;
		this.position      = position;
		this.account       = account;
	}

	public Employee() {}

	public static int getNextId()
	{
		return nextId;
	}

	public static void setNextId(int nextId)
	{
		Employee.nextId = nextId;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	public PositionEnums getPosition()
	{
		return position;
	}

	public void setPosition(PositionEnums position)
	{
		this.position = position;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getSalary()
	{
		return salary;
	}

	public void setSalary(String salary)
	{
		this.salary = salary;
	}

	public String getDateOfJoining()
	{
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
	}

	public String getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
}
