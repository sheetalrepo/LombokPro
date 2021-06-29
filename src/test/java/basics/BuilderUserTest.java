package basics;

public class BuilderUserTest {
	
	public static void testWithoutLombok() {
		//user with all fields
		BuilderUserOriginal user1 = new BuilderUserOriginal.UserBuilder("Sheetal", "Singh")
				.age(35)
				.phone("9911222333")
				.address("Down Town Pune")
				.build();
		System.out.println(user1);

		//user with only mandatory fields
		BuilderUserOriginal user3 = new BuilderUserOriginal.UserBuilder("Only", "Me")
				.build();
		System.out.println(user3);
	}
	
	public static void testWithLombok() {
		//user with all fields
		BuilderUserLombok user1 = BuilderUserLombok.builder()
				.firstName("Sheetal")
				.lastName("Singh")
				.age(35)
				.phone("9911222333")
				.address("Down Town Pune")
				.build();
		System.out.println(user1);
				
		// user with only mandatory fields
		BuilderUserLombok user2 = BuilderUserLombok.builder()
				.firstName("Only")
				.lastName("Me")
				.build();
		System.out.println(user2);
		
		
		// user with only mandatory fields
		BuilderUserLombok user3 = BuilderUserLombok.builder()
				.firstName("OneManArmy")
				.build();
		System.out.println(user3);
	}
	
	
	public static void main(String[] args) {
		testWithoutLombok();
		testWithLombok();
	}
}
