package Chapter05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee {
	private final List<String> languages = new ArrayList<>();

	public Programmer(String name, int age, int salary, LocalDate hireDay, String language) {
		super(name, age, salary, hireDay);
		this.languages.add(language);
	}

	public void addLanguage(String language) {
		this.languages.add(language);
	}

	public void removeLanguage(String language) {
		if (this.languages.contains(language)) {
			this.languages.remove(language);
		}
	}

	public List<String> getLanguages() {
		return this.languages;
	}
}
