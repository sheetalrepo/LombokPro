package basics;

public final class ValueStudentTest {

	public static void main(String[] args) {
		ValueStudentLombok student = new ValueStudentLombok("Robert", "Hernandez", 22);

		// Testing Getter methods
		System.out.println(student.getFirstName());

		// Testing toString method
		System.out.println(student.toString());

		// Testing hashCode method
		System.out.println(student.hashCode());

		// Testing equals method
		ValueStudentLombok student2 = new ValueStudentLombok("Bill", "Hernandez", 21);
		System.out.println(student.equals(student2));

	}
}
