package basics;

import lombok.Value;

/**
 * @Value is same as following annotation put together
 * 
 * @Getter, @AllArgsConstructor,@ToString and @EqualsAndHashCode,
 * @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
 * 
 * 
 * By adding the @Value annotation, we tell Lombok to:
 * 1. Declare the marked class final
 * 2. Generate an all-args constructor
 * 3. Mark all fields private and final
 * 4. Add Getter method for every field of the class
 * 5. Generate toString(), hashCode() and hashCode() methods for the annotated class
 * 6. NOT add Setter methods
 * 7. NOT provide a zero argument constructor
 * 
 * To De-lombok any class:
 * java -jar lombok-1.18.16.jar delombok -p ValueStudentLombok.java
 *
 * @author Sheetal_Singh
 *
 */
@Value
public class ValueStudentLombok {
	String firstName;
	String lastName;
	int age;
}
