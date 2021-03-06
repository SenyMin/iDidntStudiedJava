
public class Person {
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return name + "("+age+"��)";
	}
	public int hashCode()
	{
		return name.charAt(0) % 127;
	}
	public boolean equals(Object obj)
	{
		Person cmp = (Person)obj;
		if(cmp.getName().equals(name)
				&& cmp.getAge() == age)
			return true;
		else
			return false;
	}
}
