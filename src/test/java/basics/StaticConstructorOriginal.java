package basics;

/**
 * Static Constructor:
 * 1. Help us encapsulate the logic of initializing a class
 *  in a separate static factory method
 * 
 * 
 * @author Sheetal_Singh
 *
 */
public final class StaticConstructorOriginal {
	private final String firstName;
	private final String lastName;

	//private constructor
	private StaticConstructorOriginal(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//obj will be initializes via of method
	public static StaticConstructorOriginal of(final String firstName, final String lastName) {
		return new StaticConstructorOriginal(firstName, lastName);
	}

	//getters
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

}
