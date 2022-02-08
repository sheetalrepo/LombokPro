package basics;

import java.util.Date;

import lombok.extern.java.Log;

@Log
public class PersonTest {

	public static void normalBuilderMethod() {
		PersonOriginal person = new PersonOriginal.PersonBuilder()
				.withEmpId("12345")
				.withFirstName("Sheetal")
				.withLastName("Singh")
				.withDob(new Date(2000,2,25))
				.build();
		log.info(person.toString());
		
	}
	
	public static void lombokBuilderMethod() {
		PersonLombok personLombok = PersonLombok.builder()
				.empId("12345")
				.firstName("Sheetal")
				.lastname("Singh")
				.dob(new Date(2000,2,25))
				.build();
		log.info(personLombok.toString());
	}
	
	public static void lombokBuilderMethod2() {
		PersonLombok personLombok = PersonLombok.builder()
				.empId("12345")
				.build();
		log.info(personLombok.toString());
	}
	
	public static void main(String[] args) {
		normalBuilderMethod();
		lombokBuilderMethod();
		lombokBuilderMethod2();
	}

}
