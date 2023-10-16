package Chapter04;

public class ParamTest {

	StringBuilder name = new StringBuilder();

	public ParamTest() {

	}

	public static void main(String[] args) {
		ParamTest test = new ParamTest();
		test.run();
	}

	// 该方法测试了ParamUtil类中的swap()和change()方法

	// 测试结果表明：
	// 1. 方法不能修改基本数据类型的参数
	// 2. 方法可以改变对象参数的状态
	public void run() {
		// 测试1：方法不能修改基本数据类型的参数
		ParamTest a = new ParamTest();
		ParamTest b = new ParamTest();

		a.setName(new StringBuilder("张三"));
		b.setName(new StringBuilder("李四"));

		System.out.println("Before swap:");
		System.out.println("a.name = " + a.getName());
		System.out.println("b.name = " + b.getName());

		ParamUtil.swap(a, b);

		System.out.println("After swap:");
		System.out.println("a.name = " + a.getName());
		System.out.println("b.name = " + b.getName());

		System.out.println();
		System.out.println();

		// 测试2：方法可以改变对象参数的状态
		ParamTest c = new ParamTest();

		c.setName(new StringBuilder("王五"));

		System.out.println("Before change: ");
		System.out.println("c.name = " + c.getName());

		ParamUtil.change(c);

		System.out.println("After change: ");
		System.out.println("c.name = " + c.getName());
	}

	public StringBuilder getName() {
		return this.name;
	}

	public void setName(StringBuilder n) {
		this.name = n;
	}

}