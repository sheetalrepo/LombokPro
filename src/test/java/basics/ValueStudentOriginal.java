package basics;

/**
 * 
 * Immutable class: once created will not be changed
 * 
 * Rules for Immutable class
 * 1. Declare your class final to protect it from being extended by other classes
 * 2. Make all fields private
 * 3. Make all mutable fields final
 * 4. Don’t provide setters or methods that can modify the state of an object
 * 5. Initialize all mutable fields via a constructor using deep copy
 * 6. Getters or any method returning a mutable object, must always return a new instance
 * 
 * 
 * @author Sheetal_Singh
 */
public final class ValueStudentOriginal {
	private final String firstName;
	private final String lastName;
	private final int age;

	// All-args constructor
	public ValueStudentOriginal(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	// No Setters

	// Getters
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}
}
