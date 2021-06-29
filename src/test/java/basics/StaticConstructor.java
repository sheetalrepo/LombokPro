package basics;

import lombok.Value;

/**
 * 
 * java -jar lombok-1.18.16.jar delombok -p StaticConstructor.java
 * 
 * @author Sheetal_Singh
 *
 */

@Value(staticConstructor = "of")
public class StaticConstructor {
	String firstName;
	String lastName;
}
