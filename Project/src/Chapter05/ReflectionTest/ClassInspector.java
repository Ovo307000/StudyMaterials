package Chapter05.ReflectionTest;

import StudentInformationSystem.APIs.ANSI;

import java.util.Arrays;
import java.util.List;

public class ClassInspector<T> {
	private static String className = "Arrays";

	private ClassInspector() {}

	public static void main(String[] args) throws ClassNotFoundException {
		printSection(className, "Method", Arrays.asList(Class.forName(className).getMethods()));
	}

	public static void printSection(String className, String sectionName, List<T> objects) {
		System.out.println(ANSI.ConsoleFontStyle.BOLD + ANSI.ConsoleForegroundColor.randomColor(200, 255));

		if (objects.size() == 0) {
			System.out.println("[" + className + " " + sectionName + "] No " + sectionName + "!");
		} else {
			for (Object obj : objects) {
				System.out.println("[" + className + " " + sectionName + "]" + obj);
			}
		}

		System.out.println(ANSI.Reset.RESET);
	}
}
