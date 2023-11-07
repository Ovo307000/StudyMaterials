package Chapter04;

public class ParamTest
{
	private String name;
	private int    age;

	// 无参构造器
	public ParamTest() {}

	// 全参构造器
	public ParamTest(String name, int age)
	{
		this.name = name;
		this.age  = age;
	}

	public static void main(String[] args)
	{
		ParamTest paramTest = new ParamTest();

		System.out.println("测试1：交换两个对象");
		paramTest.swapTest();

		System.out.println();

		System.out.println("测试2：交换两个对象的 name 属性");
		paramTest.nameChangeTest();
	}

	public void swapTest()
	{
		ParamTest zhangSan = new ParamTest("张三", 20);
		ParamTest liSi     = new ParamTest("李四", 22);

		System.out.println("交换前：");
		System.out.println("zhangSan = " + zhangSan);
		System.out.println("liSi     = " + liSi);

		ParamUtil.swap(zhangSan, liSi);

		System.out.println("交换后：");
		System.out.println("zhangSan = " + zhangSan);
		System.out.println("liSi     = " + liSi);
	}

	private void nameChangeTest()
	{
		ParamTest zhangSan = new ParamTest("张三", 20);
		ParamTest liSi     = new ParamTest("李四", 22);

		System.out.println("交换前：");
		System.out.println("zhangSan = " + zhangSan);
		System.out.println("liSi     = " + liSi);

		ParamUtil.nameChange(zhangSan, liSi);

		System.out.println("交换后：");
		System.out.println("zhangSan = " + zhangSan);
		System.out.println("liSi     = " + liSi);

	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String toString()
	{
		return String.format("%s [name = %s, age = %d]", getClass().getName(), name, age);
	}
}