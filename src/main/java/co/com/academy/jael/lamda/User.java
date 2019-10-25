package co.com.academy.jael.lamda;

public class User {

	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public static void referenceByMethod() {
		System.out.println("test reference method static");
	}

	public void referenceByParticularMethod() {
		System.out.println("test reference method Particular");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
