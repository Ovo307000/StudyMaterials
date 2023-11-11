import StudentInformationSystem.APIs.ANSI;

import java.util.Arrays;

public class Test
{
	public static void main(String[] args)
	{
		// 对Arrays类的反射，求出该类的所有方法、构造器、域

		// 求出该类的所有方法
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
	    if (Arrays.class.getMethods().length == 0)
		{
			System.out.println("[Arrays Method] No Method!");
		}
		else
		{
			for (var method : Arrays.class.getMethods())
			{
				System.out.println("[Arrays Method]" + method);
			}
		}

		// 求出该类的所有构造器
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		if (Arrays.class.getConstructors().length == 0)
		{
			System.out.println("[Arrays Constructor] No Constructor!");
		}
		else
		{
			for (var constructor : Arrays.class.getConstructors())
			{
				System.out.println("[Arrays Constructor]" + constructor);
			}
		}

		// 求出该类的所有域
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		if (Arrays.class.getFields().length == 0)
		{
			System.out.println("[Arrays Field] No Field!");
		}
		else
		{
			for (var field : Arrays.class.getFields())
			{
				System.out.println("[Arrays Field]" + field);
			}
		}

		// 求出该类的所有内部类
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		if (Arrays.class.getClasses().length == 0)
		{
			System.out.println("[Arrays Inner Class] No Inner Class!");
		}
		else
		{
			for (var innerClass : Arrays.class.getClasses())
			{
				System.out.println("[Arrays Inner Class]" + innerClass);
			}
		}

		// 求出该类的所有注解
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		if (Arrays.class.getAnnotations().length == 0)
		{
			System.out.println("[Arrays Annotation] No Annotation!");
		}
		else
		{
			for (var annotation : Arrays.class.getAnnotations())
			{
				System.out.println("[Arrays Annotation]" + annotation);
			}
		}

		// 求出该类的所有接口
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		if (Arrays.class.getInterfaces().length == 0)
		{
			System.out.println("[Arrays Interface] No Interface!");
		}
		else
		{
			for (var interface_ : Arrays.class.getInterfaces())
			{
				System.out.println("[Arrays Interface]" + interface_);
			}
		}

		// 求出该类的所有父类
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		if (Arrays.class.getSuperclass() == null)
		{
			System.out.println("[Arrays Superclass] No Superclass!");
		}
		else
		{
			System.out.println("[Arrays Superclass]" + Arrays.class.getSuperclass());
		}

		// 求出该类的所有成员
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));
		if (Arrays.class.getDeclaredFields().length == 0)
		{
			System.out.println("[Arrays Declared Field] No Declared Field!");
		}
		else
		{
			for (var declaredField : Arrays.class.getDeclaredFields())
			{
				System.out.println("[Arrays Declared Field]" + declaredField);
			}
		}
	}
}
