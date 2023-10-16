package Chapter04;

public class ParamUtil {
	// 私有构造器，防止被实例化
	private ParamUtil() {}

	// 测试1：
	// 交换两个对象
	public static void swap(ParamTest a,
	                        ParamTest b) {
		// 这里不能使用ParamTest temp = new ParamTest();
		// 因为这样会创建一个新的对象，而不是交换两个对象的值
		ParamTest temp = a;

		a = b;
		b = temp;
	}

	// 测试2:
	// 改变对象参数的状态
	public static void change(ParamTest a) {
		a.setName(new StringBuilder("赵六"));
	}
}