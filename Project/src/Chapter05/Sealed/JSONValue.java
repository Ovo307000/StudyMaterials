package Chapter05.Sealed;

public abstract sealed class JSONValue permits JSONString
{
	String name = "JSONValue";

	public abstract void printSomething();
}
