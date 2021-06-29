package basics;

import java.util.Date;

public class PersonTest {

	public static void normalBuilderMethod() {
		PersonOriginal person = new PersonOriginal.PersonBuilder()
				.withEmpId("12345")
				.withFirstName("Sheetal")
				.withLastName("Singh")
				.withDob(new Date(2000,2,25))
				.build();
		System.out.println(person);
	}
	
	public static void lombokBuilderMethod() {
		PersonLombok personLombok = PersonLombok.builder()
				.empId("12345")
				.firstName("Sheetal")
				.lastname("Singh")
				.dob(new Date(2000,2,25))
				.build();
		System.out.println(personLombok);
	}
	
	public static void lombokBuilderMethod2() {
		PersonLombok personLombok = PersonLombok.builder()
				.empId("12345")
				.build();
		System.out.println(personLombok);
	}
	
	public static void main(String[] args) {
		normalBuilderMethod();
		lombokBuilderMethod();
		lombokBuilderMethod2();
	}

}
