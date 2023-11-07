package Chapter04;

public class ParamUtil
{
	// 私有构造器，防止被实例化
	private ParamUtil() {}

	// 测试1：
	// 交换两个对象
	public static void swap(ParamTest a, ParamTest b)
	{
		ParamTest temp = a;

		a = b;
		b = temp;
	}

	public static void nameChange(ParamTest a, ParamTest b)
	{
		String tempName = a.getName();

		a.setName(b.getName());
		b.setName(tempName);
	}
}